package ex_prototype;

public class Caminhao extends Transporte{
    private Double capacidadeDeCarga;
    private Integer numeroDeEixos;
    private Boolean possuiRefrigeracao;
    private String tipoCarroceria;

    public Caminhao(){};
    

    public Caminhao(Caminhao target){
        super(target);
        if(target != null){
            this.capacidadeDeCarga = target.capacidadeDeCarga;
            this.numeroDeEixos = target.numeroDeEixos;
            this.possuiRefrigeracao = target.possuiRefrigeracao;
            this.tipoCarroceria = target.tipoCarroceria;
        }
    }

    public Caminhao(    String tipo, double capacidade,
                        int velocidade,
                        Double capacidadeDeCarga,
                        Integer numeroDeEixos,
                        Boolean possuiRefrigeracao,
                        String tipoCarroceria) {

                        super(tipo, capacidade, velocidade);
                        this.capacidadeDeCarga = capacidadeDeCarga;
                        this.numeroDeEixos = numeroDeEixos;
                        this.possuiRefrigeracao = possuiRefrigeracao;
                        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public Transporte clone(){
        return new Caminhao(this);
    }
}
