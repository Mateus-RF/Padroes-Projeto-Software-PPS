public class App {
    public static void main(String[] args) {
        Logistica logistica;

        logistica = new LogisticaViaria();
        logistica.planejarEntrega(); // Entregando carga por terra 🚚

        logistica = new LogisticaMaritima();
        logistica.planejarEntrega(); // Entregando carga por mar 🚢
    }
}
