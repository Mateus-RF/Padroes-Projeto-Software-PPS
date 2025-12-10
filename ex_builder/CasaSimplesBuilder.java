package ex_builder;

public class CasaSimplesBuilder implements CasaBuilder {

    private CasaSimples casa = new CasaSimples();

    @Override
    public void buildParedes(int paredes) {
        casa.setParedes(paredes);
    }

    @Override
    public void buildPortas(int portas) {
        casa.setPortas(portas);
    }

    @Override
    public void buildJanelas(int janelas) {
        casa.setJanelas(janelas);
    }

    @Override
    public void buildTelhado(String tipoTelhado) {
        casa.setTipoTelhado(tipoTelhado);
    }

    @Override
    public void buildPisos(String piso) {
        casa.setPiso(piso);
    }

    @Override
    public void buildPiscina() {
        casa.setPiscina(false); // Casa simples não tem piscina
    }

    @Override
    public CasaSimples getCasa() {
        return casa;
    }
}
