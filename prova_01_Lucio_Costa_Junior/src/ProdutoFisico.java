public class ProdutoFisico extends Produto {

    

    public ProdutoFisico(String nome, double preco, Integer quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void atualizarEstoque(Integer quantidade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarEstoque'");
    }

}
