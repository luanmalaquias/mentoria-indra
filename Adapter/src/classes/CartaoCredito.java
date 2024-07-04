package classes;
import interfaces.Pagamento;

@SuppressWarnings("unused")
public class CartaoCredito implements Pagamento{

    private String numeroCartao;
    private String dataValidade;

    @Override
    public void pagar(double valor){
        System.out.println("Pagando com credito no valor de " + valor);
    }

}
