package ocp.principle.solucao;

public class FolhaPagamento {
    protected double saldo;

    
    
    public FolhaPagamento(double saldo) {
        this.saldo = saldo;
    }

    public double calcular(Remuneravel funcionario)
    {
        saldo += funcionario.remuneracao();
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    
}

