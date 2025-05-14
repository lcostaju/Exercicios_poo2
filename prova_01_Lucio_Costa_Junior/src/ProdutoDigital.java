public class ProdutoDigital extends Produto {

    public ProdutoDigital(String nome, double preco, Integer quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void atualizarEstoque(Integer quantidade) {
    }

}
