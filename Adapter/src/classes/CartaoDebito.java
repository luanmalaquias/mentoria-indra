package classes;
import interfaces.Pagamento;

@SuppressWarnings("unused")
public class CartaoDebito implements Pagamento{

    private String numeroCartao;
    private String dataValidade;

    @Override
    public void pagar(double valor){
        System.out.println("Pagando com debito no valor de " + valor);
    }
}
