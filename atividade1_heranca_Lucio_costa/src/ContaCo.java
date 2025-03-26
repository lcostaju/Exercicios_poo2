public class ContaCo extends ContaBancaria {
    private double limitechequeEspecial;

    public ContaCo(double limitechequeEspecial, String titular, double saldo) {
        super(titular, saldo);
        this.limitechequeEspecial = limitechequeEspecial;
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getLimitechequeEspecial() {
        return limitechequeEspecial;
    }

    public void setLimitechequeEspecial(double limitechequeEspecial) {
        this.limitechequeEspecial = limitechequeEspecial;
    }

    public boolean sacar(double valor) {
        if (this.saldo + this.limitechequeEspecial >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    
    public String exibeLimiteChequeEspecial() {
        return "Limite de Cheque Especial : R$ " + String.format("%.2f", this.limitechequeEspecial);
    }
        
}
