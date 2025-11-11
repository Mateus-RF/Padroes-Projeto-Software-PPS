import java.util.Scanner;

public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o estilo de moveis:");
        String movel = scan.nextLine();
        if(movel.equalsIgnoreCase("vitoriano")){
            factory = new Vitoriano();
        }else{
            factory = new Moderno();
        };

        app = new Application(factory);
        scan.close();
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
