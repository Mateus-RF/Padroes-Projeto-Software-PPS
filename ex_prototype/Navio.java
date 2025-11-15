package ex_prototype;

public class Navio extends Transporte {
    private Double capacidadeDeCarga;
    private Integer numeroDeTripulantes;
    private String tipoCasco;
    private Boolean possuiCabines;

    public Navio() {};
    public Navio(   String tipo,
                    double capacidade,
                    int velocidade,
                    Double capacidadeDeCarga,
                    Integer numeroDeTripulantes,
                    String tipoCasco,
                    Boolean possuiCabines) {
                        
                    super(tipo, capacidade, velocidade);
                    this.capacidadeDeCarga = capacidadeDeCarga;
                    this.numeroDeTripulantes = numeroDeTripulantes;
                    this.tipoCasco = tipoCasco;
                    this.possuiCabines = possuiCabines;
    }

    public Navio(Navio target) {
        super(target);
        if (target != null) {
            this.capacidadeDeCarga = target.capacidadeDeCarga;
            this.numeroDeTripulantes = target.numeroDeTripulantes;
            this.tipoCasco = target.tipoCasco;
            this.possuiCabines = target.possuiCabines;
        }
    }

    @Override
    public Transporte clone() {
        return new Navio(this);
    }
}
