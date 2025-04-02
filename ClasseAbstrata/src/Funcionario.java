public abstract class Funcionario {
    protected String nome;
    protected String clt;
    protected Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, Double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public  abstract double calcularSalario();
    
}