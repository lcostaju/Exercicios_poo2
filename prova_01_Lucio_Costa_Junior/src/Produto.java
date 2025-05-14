public abstract class Produto implements Imprimivel{

    protected String nome;
    protected double preco;
    protected Integer quantidade;

    public Produto(String nome, double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public abstract void atualizarEstoque( Integer quantidade);

    @Override
    public String imprimirDetalhes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirDetalhes'");
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    
}
