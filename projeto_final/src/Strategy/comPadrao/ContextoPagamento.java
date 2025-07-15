package Strategy.comPadrao;

public class ContextoPagamento {
    private EstrategiaPagamento estrategia;

    public void setEstrategiaPagamento(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void executarPagamento(double valor) {
        estrategia.pagar(valor);
    }
}