public abstract class Transacao implements Operacao{

    protected Produto produto;
    protected Integer quantidade;

    

    public Transacao(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }


    @Override
    public abstract String executar() throws Exception;


    public Produto getProduto() {
        return produto;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public Integer getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
