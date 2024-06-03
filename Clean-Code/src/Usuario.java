import java.util.ArrayList;

public class Usuario {
    public int id;
    public double saldo;
    public int quantidadeNotificacoes;

    static ArrayList<Usuario> usuarios = new ArrayList<>();

    Usuario(Integer id, double saldo, int quantidadeNotificacoes) {
        this.id = id;
        this.saldo = saldo;
        this.quantidadeNotificacoes = quantidadeNotificacoes;
        usuarios.add(this);
    }

    public static Usuario findById(Integer id) {
        for (Usuario usuario : usuarios) {
            if (usuario.id == id)
                return usuario;
        }
        return null;
    }
}
