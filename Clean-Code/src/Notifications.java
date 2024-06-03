import java.util.Date;
import java.util.List;

public class Notifications {

    Notifications(Date data, int usuarioId, String mensagem) {
    }

    public static void create(Notifications notification, Usuario usuario) {
    }

    public static void notificarUsuarios(List<Integer> listaIds, double valorConta) {
        for (Integer id : listaIds) {
            Usuario usuario = Usuario.findById(id);
            if (usuario != null) {
                validarSaldoEEnviarNotificacoes(usuario, valorConta);
            }
        }
    }

    public static void validarSaldoEEnviarNotificacoes(Usuario usuario, double valorConta){
        if (valorConta > usuario.saldo) {
            if (usuario.quantidadeNotificacoes >= 4) {
                new Notifications(new Date(), usuario.id, "Voce foi notificado mais de 3 vezes. Sua assinatura foi cancelada");
            } else {
                new Notifications(new Date(), usuario.id, "Sem saldo para realizar o pagamento");
            }
        }
    }
}
