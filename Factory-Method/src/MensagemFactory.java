public interface MensagemFactory {
    <T extends Mensagem> T criarMensagem(String tipo, String conteudo, String destino);
}
