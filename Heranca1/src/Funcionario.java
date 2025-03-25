

public class Funcionario extends Pessoa {
    private double salario;
    private int data_admissao;
    private String cargo;

    public Funcionario(String nome, String cpf, int data_nascimento, String cargo, double salario, int data_admissao) {
        super(nome, cpf, data_nascimento);
        this.cargo = cargo;
        this.salario = salario;
        this.data_admissao = data_admissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario() {
        return salario;
    }

    public int getData_admissao() {
        return data_admissao;
    }
    
}
