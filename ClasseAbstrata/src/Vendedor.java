public class Vendedor extends Funcionario {
    
    private double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, Double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
        
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public double calcularSalario() {
        return this.salario + (this.totalVendas * 0.05);
    }
}
