package ex_adapter;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;


public class AdapterXMLParaJSON implements LeitorDeDados {

    private final LeitorXMLExistente leitorXML;

    public AdapterXMLParaJSON(LeitorXMLExistente leitorXML) {
        this.leitorXML = leitorXML;
    }

    @Override
    public String lerDados() {
        String xml = leitorXML.buscarXML();
        try {
            Document doc = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder()
                    .parse(new org.xml.sax.InputSource(new java.io.StringReader(xml)));

            doc.getDocumentElement().normalize();

            Node raiz = doc.getDocumentElement();

            JSONObject json = new JSONObject();
            json.put(raiz.getNodeName(), processarElemento(raiz));

            return json.toString(4);
        } catch (Exception e) {
            return "{}";
        }
    }

    private Object processarElemento(Node node) {
        NodeList filhos = node.getChildNodes();
        Map<String, Object> mapa = new LinkedHashMap<>();
        Map<String, List<Object>> listas = new LinkedHashMap<>();

        for (int i = 0; i < filhos.getLength(); i++) {
            Node filho = filhos.item(i);
            if (filho.getNodeType() == Node.ELEMENT_NODE) {
                Object valor = processarElemento(filho);
                String nome = filho.getNodeName();
                listas.putIfAbsent(nome, new ArrayList<>());
                listas.get(nome).add(valor);
            }
        }

        if (listas.isEmpty()) {
            return node.getTextContent();
        }

        for (String chave : listas.keySet()) {
            if (listas.get(chave).size() == 1) {
                mapa.put(chave, listas.get(chave).get(0));
            } else {
                mapa.put(chave, new JSONArray(listas.get(chave)));
            }
        }

        return mapa;
    }
}
