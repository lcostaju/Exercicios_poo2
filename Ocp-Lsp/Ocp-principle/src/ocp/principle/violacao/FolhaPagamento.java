package ocp.principle.violacao;

public class FolhaPagamento {

    protected double saldo;

    public FolhaPagamento(double saldo) {
        this.saldo = saldo;
    }


    public double calcular(Funcionario funcionario) {
        /*
         * Se ( funcionario = assalariado )
         * saldo += Pagamento.salario();
         * senão se ( funcionario = estagiario) {
         * saldo += Pagamento.bolsaAuxilio();
         */

        if (funcionario.getTipo() == "assalariado") {

            saldo += Pagamento.salario();
        } else {
            saldo += Pagamento.bolsaAuxilio();
        }
        return saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    
}
