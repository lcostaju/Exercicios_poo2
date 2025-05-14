public class App {
    public static void main(String[] args) throws Exception {
       ProdutoFisico produtoFisico1 = new ProdutoFisico("lapis", 1.99, 10);
       ProdutoFisico produtoFisico2 = new ProdutoFisico("caneta", 2.99, 20);
       Compra compra = new Compra(produtoFisico2, 20);
       Venda venda = new Venda(produtoFisico2, 5);
       Venda venda2 = new Venda(produtoFisico2, 10);
       
    
       Compra compra2 = new Compra(produtoFisico2, 40);
    // System.out.println("Produto: " + compra.getProduto().getNome());
    // System.out.println("Preço: " + compra.getProduto().getPreco());
    // System.out.println("Quantidade: " + compra.getQuantidade());
    
    System.out.println(compra.executar());
    System.out.println(venda.executar());
    System.out.println(venda2.executar());
    System.out.println(compra2.executar());
    
    System.out.println(GerenciaEstoque.listarProdutos());
    }
}
