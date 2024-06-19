public class NotificacaoPush extends Mensagem implements MensagemFactory{

    public NotificacaoPush(){};

    public NotificacaoPush(String tipo, String conteudo, String destino) {
        super(tipo, conteudo, destino);
    }

    @Override
    public <T extends Mensagem> T criarMensagem(String tipo, String conteudo, String destino) {
        return (T) new NotificacaoPush(tipo, conteudo, destino);
    }
}