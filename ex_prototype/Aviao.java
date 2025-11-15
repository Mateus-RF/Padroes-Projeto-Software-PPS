package ex_prototype;

public class Aviao extends Transporte{
    private Integer numeroDeMotores;
    private Double envergaduraAsas;
    private Double altitudeMaxima;

    public Aviao(){};

    public Aviao(Aviao target){
        super(target);
        if(target != null){
            this.altitudeMaxima = target.altitudeMaxima;
            this.envergaduraAsas = target.envergaduraAsas;
            this.numeroDeMotores = target.numeroDeMotores;
        }
    }
    public Aviao(   String tipo,
                    double capacidade,
                    int velocidade,
                    Integer numeroDeMotores,
                    Double envergaduraAsas,
                    Double altitudeMaxima) {
                        
                    super(tipo, capacidade, velocidade);
                    this.numeroDeMotores = numeroDeMotores;
                    this.envergaduraAsas = envergaduraAsas;
                    this.altitudeMaxima = altitudeMaxima;
    }

    @Override
    public Transporte clone(){
        return new Aviao(this);
    }
}
