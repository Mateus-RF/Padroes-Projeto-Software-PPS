package ex_builder;

public class Diretor {

    public void construirCasaSimples(CasaBuilder builder) {
        builder.buildParedes(4);
        builder.buildPortas(1);
        builder.buildJanelas(2);
        builder.buildTelhado("Telhado comum de cerâmica");
        builder.buildPisos("Cerâmica simples");
        builder.buildPiscina(); 
    }

    public void construirCasaDeLuxo(CasaBuilder builder) {
        builder.buildParedes(10);
        builder.buildPortas(4);
        builder.buildJanelas(8);
        builder.buildTelhado("Telhado premium de vidro reforçado");
        builder.buildPisos("Porcelanato premium");
        builder.buildPiscina();
    }

    public void construirCasaDuplex(CasaBuilder builder) {
        builder.buildParedes(12);
        builder.buildPortas(3);
        builder.buildJanelas(6);
        builder.buildTelhado("Telhado de duas águas com isolamento");
        builder.buildPisos("Granito");
        builder.buildPiscina();
    }
}
