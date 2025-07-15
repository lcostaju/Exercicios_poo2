package Strategy.comPadrao;

public class PagamentoPayPal implements EstrategiaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " via PayPal.");
    }
}