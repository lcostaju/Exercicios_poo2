package Strategy.comPadrao;
public class PagamentoCartaoCredito implements EstrategiaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " via Cartão de Crédito.");
    }
}