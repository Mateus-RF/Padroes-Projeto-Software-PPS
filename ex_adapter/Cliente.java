package ex_adapter;

public class Cliente {

    private final LeitorDeDados leitor;

    public Cliente(LeitorDeDados leitor) {
        this.leitor = leitor;
    }

    public void gerarRelatorio() {
        String json = leitor.buscarDados();
        System.out.println("Relatório gerado:");
        System.out.println(json);
    }
}
