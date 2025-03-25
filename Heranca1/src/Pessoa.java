

public class Pessoa {
    private String nome;
    private String cpf;
    private int data_nascimento;

    public Pessoa(String nome, String cpf, int data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getData_nascimento() {
        return data_nascimento;
    }
}
