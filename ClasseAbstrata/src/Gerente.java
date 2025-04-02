public class Gerente extends Funcionario {
    
    public Gerente(String nome, String clt, Double salario) {
        super(nome, clt, salario);
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public double calcularSalario() {
        return this.salario + (this.salario * 0.1);
    }
    
}
