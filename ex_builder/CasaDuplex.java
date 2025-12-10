package ex_builder;

public class CasaDuplex {
    private int paredes;
    private int portas;
    private int janelas;
    private String tipoTelhado;
    private String pisos;
    private boolean piscina;

    public void setParedes(int paredes) { this.paredes = paredes; }

    public void setPortas(int portas) { this.portas = portas; }

    public void setJanelas(int janelas) { this.janelas = janelas; }

    public void setTipoTelhado(String tipoTelhado) { this.tipoTelhado = tipoTelhado; }

    public void setPisos(String pisos) { this.pisos = pisos; }

    public void setPiscina(boolean piscina) { this.piscina = piscina; }

    @Override
    public String toString() {
        return "\nCasaDuplex {" +
                "\n paredes=" + paredes +
                ",\n portas=" + portas +
                ",\n janelas=" + janelas +
                ",\n tipoTelhado='" + tipoTelhado + '\'' +
                ",\n piso='" + pisos + '\'' +
                ",\n piscina=" + piscina +
                "\n}";
    }
}
