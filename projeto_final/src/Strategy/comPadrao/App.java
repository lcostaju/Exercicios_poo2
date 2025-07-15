package Strategy.comPadrao;

public class App {
    public static void main(String[] args) {
        ContextoPagamento contexto = new ContextoPagamento();

        contexto.setEstrategiaPagamento(new PagamentoCartaoCredito());
        contexto.executarPagamento(100.0);

        contexto.setEstrategiaPagamento(new PagamentoPayPal());
        contexto.executarPagamento(50.0);
    }
}