public class User {
    private String nome;
    private String permissao;

    public User(String nome, String permissao) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do usuário não pode ser nulo ou vazio.");
        }

        if (permissao == null || permissao.trim().isEmpty()) {
            throw new IllegalArgumentException("A permissão do usuário não pode ser nula ou vazia.");
        }

        this.nome = nome;
        this.permissao = permissao;
    }


    public String getNome() {
        return nome;
    }

    public String getPermissao() {
        return permissao;
    }

    @Override
    public String toString() {
        return "Usuário: " + nome + " (Permissão: " + permissao + ")";
    }
}
