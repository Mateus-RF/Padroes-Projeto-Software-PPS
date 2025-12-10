package ex_builder;

public interface CasaBuilder {
    void buildParedes(int paredes);
    void buildPortas(int portas);
    void buildJanelas(int janelas);
    void buildTelhado(String tipoTelhado);
    void buildPisos(String piso);
    void buildPiscina();
    Object getCasa();
    
}
