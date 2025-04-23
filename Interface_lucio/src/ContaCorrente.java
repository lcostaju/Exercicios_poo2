public class ContaCorrente implements Conta {

    public double saldo;
    public double taxa;
    

    public ContaCorrente(double saldo, double taxa) {
        this.saldo = saldo;
        this.taxa = taxa;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - (valor + valor*taxa);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
    
}
