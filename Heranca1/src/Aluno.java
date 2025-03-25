

public class Aluno extends Pessoa {
    private long matricula;

    public Aluno(String nome, String cpf, int data_nascimento, long matricula) {
        super(nome, cpf, data_nascimento);
        this.matricula = matricula;
    }

    public long getMatricula() {
        return matricula;
    }

}
