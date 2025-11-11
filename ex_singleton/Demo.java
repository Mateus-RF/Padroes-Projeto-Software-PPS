public class Demo {
    public static void main(String[] args) {
        User u1 = new User("Mateus", "edição");
        User u2 = new User("Maria", "leitura");

        Document doc = new Document("Relatorio.docx", "Conteudo inicial.");

        // Todas as partes do sistema pedem a mesma instância
        DocumentManager manager1 = DocumentManager.getInstance();
        DocumentManager manager2 = DocumentManager.getInstance();

        System.out.println(manager1 == manager2);

        manager1.abrirDoc(u1, doc);
        manager1.exibirDocumento();

        manager2.bloquearDoc(u1);
        manager1.exibirDocumento();

        manager1.desbloquearDoc(u2);
        manager2.desbloquearDoc(u1);
        manager1.fecharDoc(u2, doc);
    }
}
