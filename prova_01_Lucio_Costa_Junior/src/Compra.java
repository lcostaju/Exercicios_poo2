import java.util.List;

public class Compra extends Transacao{

    public Compra(Produto produto, Integer quantidade) {
        super(produto, quantidade);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String executar() throws Exception {
        List<Produto> produtosList = GerenciaEstoque.getProdutos();
        
        Produto produtoAdd = GerenciaEstoque.buscarProduto(produto.getNome());
        if ( produtoAdd == null) {
            GerenciaEstoque.adicionarProduto(produto);
            produtoAdd = GerenciaEstoque.buscarProduto(produto.getNome());
        }else{
            for (Produto p : produtosList) {
                if (p.getNome().equalsIgnoreCase(produtoAdd.getNome())) {
                    p.setQuantidade(p.quantidade + quantidade);
                }
            }

            GerenciaEstoque.setProdutos(produtosList);
            produtoAdd = GerenciaEstoque.buscarProduto(produto.getNome());
        }
        // }else{
        //     for (Produto p : produtosList) {
        //         p.setQuantidade(produto.quantidade);
        //     }
        //     GerenciaEstoque.setProdutos(produtosList);
        //     produtoAdd = GerenciaEstoque.buscarProduto(produto.getNome());
        // }
        
        // Produto produtoShow = GerenciaEstoque.buscarProduto(produtoAdd.getNome());
        
        // return "Compra Realizada: "+produtoShow.getQuantidade()+" x "+produtoShow.getNome();
        return "Compra Realizada: "+produtoAdd.getQuantidade()+" x "+produtoAdd.getNome();

        
    }

    

}
