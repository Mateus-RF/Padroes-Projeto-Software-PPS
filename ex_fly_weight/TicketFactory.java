import java.util.HashMap;
import java.util.Map;


class TicketFactory {
    private static final Map<String, TicketFlyWeight> flyweights = new HashMap<>();
    private static int flyweightCount = 0;

    public static TicketFlyWeight getFlyweight(String evento, String local, String data, String cor){
        String key = getChave(evento, local, data, cor);

        if (!flyweights.containsKey(key)) {
        flyweights.put(key, new TicketFlyWeight(evento, local, data, cor));
        flyweightCount++;
        System.out.println("Criado novo objeto Flyweight para: " + key);
        }

        return flyweights.get(key);

    }
    private static String getChave(String eventName, String location, String date, String color) {
        return eventName + "_" + location + "_" + date + "_" + color;
    }

    public static int getTodosFlyweightsCriados() {
        return flyweightCount;
    }
}