public class SMS extends Mensagem implements MensagemFactory{

    public SMS(){};

    public SMS(String tipo, String conteudo, String destino) {
        super(tipo, conteudo, destino);
    }

    @Override
    public <T extends Mensagem> T criarMensagem(String tipo, String conteudo, String destino) {
        return (T) new SMS(tipo, conteudo, destino);
    }
    
}
