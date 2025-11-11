public class Application {
    private Chair chair;
    private CoffeTable table;

    public Application(GUIFactory factory) {
        chair = factory.createChair();
        table = factory.createCoffeTable();
    }

    public void paint() {
        chair.sentarChair();
        table.apoiar();
    }
}