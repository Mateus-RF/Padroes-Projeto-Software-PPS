public class Ticket {
    private final TicketFlyWeight flyweight;
    private final String compradorID; // Dado único
    private static int ticketCount = 0;

    public Ticket(String evento, String local, String data, String cor, String compradorId){
        this.flyweight = TicketFactory.getFlyweight(evento, local, data, cor);
        this.compradorID = compradorId;
        ticketCount++;

    }

    public void printTicket(){
        flyweight.printTicketInfo(compradorID);
    }

    public String getCompradorID(){
        return compradorID;
    }

    public TicketFlyWeight getFlyWeight(){
        return flyweight;
    }
    
    public static int getTicketCount() {
        return ticketCount;
    }
}