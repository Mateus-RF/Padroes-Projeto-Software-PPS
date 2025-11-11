
public final class DocumentManager {
    private static volatile DocumentManager instance;

    private Document documentoAtual;

    private DocumentManager() {}; 

    public static DocumentManager getInstance(){
        DocumentManager result = instance;
        if(result != null){
            return result;
        }
        synchronized(DocumentManager.class) {
            if(instance == null){
                instance = new DocumentManager();
            }
            return instance;
        }
        
    };
    public void abrirDoc(User user, Document documento){
        if(documentoAtual != null){
            System.out.println("[WARN] Ja existe um documento aberto" + documentoAtual.getTitulo());
        };

        documentoAtual = documento;
        System.out.println("[INFO] Documento '" + documento.getTitulo() + "' aberto por " + user.getNome()); 

    };
    public void fecharDoc(User user, Document doc){
        if(documentoAtual == null){
            System.out.println("[WARN] Nenhum documento pra Fechar");
        }
        System.out.println("[INFO] Documento " + documentoAtual.getTitulo() + " fechado por " + user.getNome());
        documentoAtual = null;
    };
    public synchronized void bloquearDoc(User user){
        if (documentoAtual == null){
             System.out.println("[WARN] Nenhum documento para bloquear" + documentoAtual.getTitulo());
             return;
        }
        try {
            documentoAtual.bloquear(user);
        } catch (Exception e) {
            System.out.println("[ERRO]" + e.getMessage());
        }

    };
    public void desbloquearDoc(User user){
        if (documentoAtual == null) {
            System.out.println("[WARN] Nenhum documento aberto para desbloquear.");
            return;
        }

        try {
            documentoAtual.desbloquear(user);
        } catch (Exception e) {
            System.out.println("[ERRO] " + e.getMessage());
        }
    }
    public void exibirDocumento() {
        if (documentoAtual == null) {
            System.out.println("[INFO] Nenhum documento aberto.");
        } else {
            documentoAtual.exibirConteudo();
        }
    }
}
