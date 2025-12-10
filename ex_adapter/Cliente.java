package ex_adapter;

public class Cliente {
    public static void main(String[] args) {
        LeitorXMLExistente xml = new LeitorXMLExistente();
        LeitorDeDados leitor = new AdapterXMLParaJSON(xml);

        String json = leitor.lerDados();
        System.out.println(json);
    }
}
