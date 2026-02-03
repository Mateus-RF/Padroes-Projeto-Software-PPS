public class SistemaTickets{
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE VENDA DE BILHETES COM FLYWEIGHT ===\n");
        
        String evento = "Festival de Musica Internacional";
        String local = "Estadio Nacional, Sao Paulo";
        String data = "15/02/2026";
   
        String[] colors = {"ouro", "prata", "bronze"};
        

        int totalTickets = 100000;
        
        System.out.println("Vendendo " + totalTickets + " bilhetes...\n");
        
        for (int i = 1; i <= totalTickets; i++) {
            String cor;
            if (i % 10 == 0) {
                cor = colors[0]; // ouro
            } else if (i % 3 == 0) {
                cor = colors[1]; // prata
            } else {
                cor = colors[2]; // bronze
            }
            
            String compradorID = "COMPRADOR-" + String.format("%06d", i);
            Ticket ticket = new Ticket(evento, local, data, cor, compradorID);
            
            // Exibir alguns bilhetes como exemplo
            if (i <= 3) {
                System.out.println("Exemplo de bilhete " + i + ":");
                ticket.printTicket();
            }
            
            // Mostrar progresso a cada 10.000 bilhetes
            if (i % 10000 == 0) {
                System.out.println("Vendidos: " + i + " bilhetes");
            }
        }
        
        System.out.println("\n=== RESUMO FINAL ===");
        System.out.println("Total de bilhetes vendidos: " + Ticket.getTicketCount());
        System.out.println("Total de objetos Flyweight criados: " + TicketFactory.getTodosFlyweightsCriados());
        System.out.println("\nDetalhes dos objetos Flyweight criados:");
        System.out.println("1. Festival de Musica Internacional_Estadio Nacional, Sao Paulo_15/12/2024_ouro");
        System.out.println("2. Festival de Musica Internacional_Estadio Nacional, Sao Paulo_15/12/2024_prata");
        System.out.println("3. Festival de Musica Internacional_Estadio Nacional, Sao Paulo_15/12/2024_bronze");
        System.out.println("\nEconomia de memoria:");
        System.out.println("Sem Flyweight: " + totalTickets + " objetos completos");
        System.out.println("Com Flyweight: 3 objetos compartilhados + " + totalTickets + " objetos leves (Ticket)");
        System.out.println("Reducao: " + (totalTickets - 3) + " objetos pesados evitados!");
    }
}
