public class ContaPoEstudantil extends ContaPo {
    private double limiteIsencaoTaxa;

    public ContaPoEstudantil(double limiteIsencaoTaxa, double taxaRendimento, String titular, double saldo) {
        super(taxaRendimento, titular, saldo);
        this.limiteIsencaoTaxa = limiteIsencaoTaxa;
    }

    public double getLimiteIsencaoTaxa() {
        return limiteIsencaoTaxa;
    }

    public void setLimiteIsencaoTaxa(double limiteIsencaoTaxa) {
        this.limiteIsencaoTaxa = limiteIsencaoTaxa;
    }


    @Override
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
}
