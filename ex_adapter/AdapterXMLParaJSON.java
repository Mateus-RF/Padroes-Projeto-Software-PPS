package ex_adapter;

import org.json.JSONObject;
import org.json.XML;

public class AdapterXMLParaJSON implements LeitorDeDados {

    private final LeitorDeDadosXML leitorXML;

    public AdapterXMLParaJSON(LeitorDeDadosXML leitorXML) {
        this.leitorXML = leitorXML;
    }

    @Override
    public String buscarDados() {
        String xml = leitorXML.buscarDadosXML();

        JSONObject json = XML.toJSONObject(xml); 

        return json.toString(4);
    }
}