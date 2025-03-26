public class ContaCoPremium extends ContaCo {
    private double cashBackPercentual;

    public ContaCoPremium(double cashBackPercentual, double limitechequeEspecial, String titular, double saldo) {
        super(limitechequeEspecial, titular, saldo);
        this.cashBackPercentual = cashBackPercentual;
    }

    public double getCashBackPercentual() {
        return cashBackPercentual;
    }

    public void setCashBackPercentual(double cashBackPercentual) {
        this.cashBackPercentual = cashBackPercentual;
    }

    @Override
    public boolean sacar(double valor) {
        if (super.sacar(valor)) {
            double cashBack = valor * (cashBackPercentual / 100);
            super.depositar(cashBack);
            return true;
        }
        return false;
    }

    public String exibeBeneficioPremium(){
        return "Conta Corrente Premium com cashback de " + cashBackPercentual + "% em cada saque.";
    }
    
}
