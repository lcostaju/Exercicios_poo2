package ocp.principle.violacao;

public class Funcionario {
    // nome, tipo, remuneração;
    private String nome,tipo;
    private Double remuneracao; 
    // construtor
    public Funcionario(String nome, String tipo, Double remuneracao) {
        this.nome = nome;
        this.tipo = tipo;
        this.remuneracao = remuneracao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getRemuneracao() {
        return remuneracao;
    }
    public void setRemuneracao(Double remuneracao) {
        this.remuneracao = remuneracao;
    }
    
}
