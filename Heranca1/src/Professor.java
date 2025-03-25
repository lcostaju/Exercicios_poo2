

public class Professor extends Pessoa {
    private double salario;
    private String disciplina;

    public Professor(String nome, String cpf, int data_nascimento, String disciplina, double salario) {
        super(nome, cpf, data_nascimento);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public double getSalario() {
        return salario;
    }
}
