
class TicketFlyWeight{
    private String eventoNome;
    private String local;
    private String data;
    private String cor;

    public TicketFlyWeight (String evento, String local, String data, String cor) {
        this.eventoNome = evento;
        this.local = local;
        this.data = data;
        this.cor = cor;
    }

    public void printTicketInfo(String CompradorId) {
        System.out.println("Evento: " + eventoNome);
        System.out.println("Local: " + local);
        System.out.println("Data: " + data);
        System.out.println("Cor: " + cor);
        System.out.println("ID Comprador: " + CompradorId);
        System.out.println("-----------------------------------");
    }
    public String getCor() {
        return cor;
    }

    public String getEventoNome() {
        return eventoNome;
    }

    public String getLocal() {
        return local;
    }
    
    public String getData() {
        return data;
    }
}