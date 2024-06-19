public class Mensagem {
    protected String tipo;
    protected String conteudo;
    protected String destino;

    public Mensagem(){};

    public Mensagem(String tipo, String conteudo, String destino){
        this.tipo = tipo;
        this.conteudo = conteudo;
        this.destino = destino;
    }

    public void enviar(){
        System.out.println("Mensagem " + this.tipo + " enviada para o endereço " + this.destino + ". Conteudo: " + this.conteudo);
    }

}