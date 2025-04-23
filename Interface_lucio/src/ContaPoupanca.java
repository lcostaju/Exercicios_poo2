public class ContaPoupanca implements Conta {

public double saldo;


    public ContaPoupanca(double saldo) {
    this.saldo = saldo;
}

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
    
}
