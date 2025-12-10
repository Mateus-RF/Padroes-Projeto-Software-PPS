package ex_builder;

public class Main {
    public static void main(String[] args) {

        Diretor diretor = new Diretor();

        CasaBuilder builderSimples = new CasaSimplesBuilder();
        diretor.construirCasaSimples(builderSimples);
        CasaSimples casaSimples = (CasaSimples) builderSimples.getCasa();

        System.out.println("=== CASA SIMPLES ===");
        System.out.println(casaSimples);
        System.out.println();


        CasaBuilder builderLuxo = new CasaDeLuxoBuilder();
        diretor.construirCasaDeLuxo(builderLuxo);
        CasaDeLuxo casaLuxo = (CasaDeLuxo) builderLuxo.getCasa();

        System.out.println("=== CASA DE LUXO ===");
        System.out.println(casaLuxo);
        System.out.println();

        CasaBuilder builderDuplex = new CasaDuplexBuilder();
        diretor.construirCasaDuplex(builderDuplex);
        CasaDuplex casaDuplex = (CasaDuplex) builderDuplex.getCasa();

        System.out.println("=== CASA DUPLEX ===");
        System.out.println(casaDuplex);
        System.out.println();
    }
}
