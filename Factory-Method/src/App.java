public class App {
    public static void main(String[] args) throws Exception {
        MensagemFactory factory;

        factory = new Email();
        Mensagem mensagemEmail = factory.criarMensagem("EMAIL", "Conteudo do Email...", "destino@email.com");
        mensagemEmail.enviar();

        factory = new NotificacaoPush();
        Mensagem mensagemNotificacao = factory.criarMensagem("PUSH", "Conteudo da Notificação...", "+55 88 8888-8888");
        mensagemNotificacao.enviar();

        factory = new SMS();
        Mensagem mensagemSMS = factory.criarMensagem("SMS", "Conteudo do SMS...", "+55 88 8888-8888");
        mensagemSMS.enviar();

    }
}
