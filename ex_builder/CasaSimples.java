package ex_builder;


public class CasaSimples {
    private int paredes;
    private int portas;
    private int janelas;
    private String tipoTelhado;
    private boolean piscina;
    private String piso;

    public void setParedes(int paredes) { this.paredes = paredes; }
    public void setPortas(int portas) { this.portas = portas; }
    public void setJanelas(int janelas) { this.janelas = janelas; }
    public void setTipoTelhado(String tipoTelhado) { this.tipoTelhado = tipoTelhado; }
    public void setPiscina(boolean piscina) { this.piscina = piscina; }
    public void setPiso(String piso) { this.piso = piso; }

    @Override
    public String toString() {
        return "CasaSimples {" +
                "\n paredes=" + paredes +
                ",\n portas=" + portas +
                ",\n janelas=" + janelas +
                ",\n tipoTelhado='" + tipoTelhado + '\'' +
                ",\n piscina=" + piscina +
                ",\n piso='" + piso + '\'' +
                "\n}";
    }
}
