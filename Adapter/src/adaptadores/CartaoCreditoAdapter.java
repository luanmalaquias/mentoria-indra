package adaptadores;
import classes.CartaoCredito;
import interfaces.Pagamento;

public class CartaoCreditoAdapter implements Pagamento{
    private CartaoCredito cartaoCredito;

    public CartaoCreditoAdapter(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Aplicando acrésimo de 1.50");
        valor += 1.50;
        System.out.println("Realizando pagamento com crédito no valor de R$ " + valor);
        cartaoCredito.pagar(valor);
    }
}
