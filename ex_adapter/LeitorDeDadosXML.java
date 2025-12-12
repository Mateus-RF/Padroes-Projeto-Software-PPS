package ex_adapter;

public class LeitorDeDadosXML {
    private final String xml;

    public LeitorDeDadosXML(String xml) {
        this.xml = xml;
    }

    public String buscarDadosXML() {
        return xml;
    }
}
