public abstract class Logistica{

    abstract Transporte criarTransporte();

    public void planejarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.deliver();
    }
}