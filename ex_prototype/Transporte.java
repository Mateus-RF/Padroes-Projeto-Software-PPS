package ex_prototype;

public class Transporte {
    private String tipo;
    private double capacidade;
    private int velocidade;

    public Transporte() {
        this.tipo = "";
        this.capacidade = 0.0;
        this.velocidade = 0;
    }

    public Transporte(String tipo, double capacidade, int velocidade) {
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    public Transporte(Transporte transporte) {
        this.tipo = transporte.tipo;
        this.capacidade = transporte.capacidade;
        this.velocidade = transporte.velocidade;
    }
    

    public Transporte clone(){
        return new Transporte();
    };
    
    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Capacidade: " + capacidade + ", Velocidade: " + velocidade;
    }

   
}