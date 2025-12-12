package ex_adapter;

public class Main {
    public static void main(String[] args) {

        String xmlDinamico = """
                <concessionaria>
                    <carro>
                        <modelo>Uno</modelo>
                        <ano>2010</ano>
                        <cor>Prata</cor>
                    </carro>
                    <carro>
                        <modelo>HB20</modelo>
                        <ano>2022</ano>
                        <combustivel>Flex</combustivel>
                    </carro>
                </concessionaria>
                """;

        LeitorDeDadosXML legado = new LeitorDeDadosXML(xmlDinamico);
        LeitorDeDados adapter = new AdapterXMLParaJSON(legado);
        Cliente cliente = new Cliente(adapter);

        cliente.gerarRelatorio();
    }
}