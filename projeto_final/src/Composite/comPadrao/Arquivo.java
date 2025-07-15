package Composite.comPadrao;

public class Arquivo implements ComponenteSistemaArquivo {
    private String nome;
    private double tamanho;

    public Arquivo(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public String getNome() { return nome; }

    @Override
    public double getTamanho() { return tamanho; }
}