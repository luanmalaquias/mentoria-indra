public class Email extends Mensagem implements MensagemFactory{

    public Email(){};
    
    public Email(String tipo, String conteudo, String destino) {
        super(tipo, conteudo, destino);
    }

    @Override
    public <T extends Mensagem> T criarMensagem(String tipo, String conteudo, String destino) {
        return (T) new Email(tipo, conteudo, destino);
    }
}
