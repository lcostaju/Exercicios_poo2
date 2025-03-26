public class ContaPo extends ContaBancaria {
    private double taxaRendimento;

    public ContaPo(double taxaRendimento, String titular, double saldo) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        this.saldo += this.saldo * this.taxaRendimento;
    }
    
    @Override
    public String exibeSaldo() {
        return "Saldo da conta poupança de " + this.titular + ": R$ " + String.format("%.2f", this.saldo);
    }
}
