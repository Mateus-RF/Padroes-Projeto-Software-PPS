package ex_builder;

public class CasaDeLuxoBuilder implements CasaBuilder {

    private CasaDeLuxo casa = new CasaDeLuxo();

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
        casa.setPisos(piso);
    }

    @Override
    public void buildPiscina() {
        casa.setPiscina(true); 
    }

    @Override
    public CasaDeLuxo getCasa() {
        return casa;
    }
}
