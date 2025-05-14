import java.util.List;

public class Venda extends Transacao{

    public Venda(Produto produto, Integer quantida) {
        super(produto, quantida);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String executar() throws Exception {
        List<Produto> produtosList = GerenciaEstoque.getProdutos();
        Produto produtoCompra = GerenciaEstoque.buscarProduto(produto.getNome());

        if (produtoCompra == null) {
            throw new Exception("Estoque insuficiente para venda");
        } else if (produtoCompra.getQuantidade() < quantidade) {
            throw new Exception("Estoque insuficiente para venda");
        }else{
            for (Produto p : produtosList) {
                if (p.getNome().equalsIgnoreCase(produtoCompra.getNome())) {
                    p.setQuantidade(p.getQuantidade() - quantidade);
                }
            }

            return "Venda Realizada: "+produtoCompra.getQuantidade()+" x "+produtoCompra.getNome();
        }
    }

}
