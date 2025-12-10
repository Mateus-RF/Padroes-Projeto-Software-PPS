import java.util.Scanner;

public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o estilo de móveis?");
        String movel = scan.nextLine();

        if (movel.equalsIgnoreCase("vitoriano")) {
            factory = new Vitoriano();
        } else {
            factory = new Moderno();
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
