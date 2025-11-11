public class Document {
    private String titulo;
    private String conteudo;
    private Boolean bloqueado;
    private User userBloqueio;

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Boolean getEstado() {
        return bloqueado;
    }

    public User getUserBloqueio() {
        return userBloqueio;
    }

    public Document(String title, String context){
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("O titulo do documento nao pode ser nulo ou vazio.");
        }

        this.titulo = title;
        this.conteudo = conteudo != null ? conteudo : "";
        this.bloqueado = false;
        this.userBloqueio = null;
    }

     public void bloquear(User usuario) {
        if (bloqueado) {
            throw new IllegalStateException("O documento ja esta bloqueado por outro usuario.");
        }
        bloqueado = true;
        userBloqueio = usuario;
        System.out.println("[INFO] Documento '" + titulo + "' bloqueado por " + usuario.getNome());
    }

    public void desbloquear(User usuario) {
        if (!bloqueado) {
            System.out.println("[INFO] Documento '" + titulo + "' ja esta desbloqueado.");
            return;
        }

        if (!usuario.equals(userBloqueio)) {
            throw new SecurityException("Somente o usuario que bloqueou o documento pode desbloquea-lo.");
        }

        bloqueado = false;
        userBloqueio = null;
        System.out.println("[INFO] Documento '" + titulo + "' foi desbloqueado por " + usuario.getNome());
    }

     public void editar(User usuario, String novoConteudo) {
        if (bloqueado && !usuario.equals(userBloqueio)) {
            throw new SecurityException("Documento bloqueado. Apenas o usuário que bloqueou pode edita-lo.");
        }

        conteudo = novoConteudo;
        System.out.println("[INFO] Documento '" + titulo + "' editado por " + usuario.getNome());
    }

    public void exibirConteudo() {
        System.out.println("==== Documento: " + titulo + " ====");
        System.out.println(conteudo);
        System.out.println("==============================");
    }

    @Override
    public String toString() {
        return "Documento: " + titulo + " | Bloqueado: " + bloqueado;
    }
}
