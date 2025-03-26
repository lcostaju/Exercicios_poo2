public class ContaCoEmpresarial extends ContaCo {
    private double taxaJurosEmprestimo;

    public ContaCoEmpresarial(double taxaJurosEmprestimo, double limitechequeEspecial, String titular, double saldo) {
        super(limitechequeEspecial, titular, saldo);
        this.taxaJurosEmprestimo = taxaJurosEmprestimo;
    }

    public double getTaxaJurosEmprestimo() {
        return taxaJurosEmprestimo;
    }

    public void setTaxaJurosEmprestimo(double taxaJurosEmprestimo) {
        this.taxaJurosEmprestimo = taxaJurosEmprestimo;
    }

    public boolean solicitaEmprestimo( double valor){
        if((this.saldo + this.getLimitechequeEspecial()) >= valor){
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String exibeSaldo() {
        return "Saldo da conta corrente empresarial de " + this.titular + ": R$ " + String.format("%.2f", this.saldo);
    }
}
