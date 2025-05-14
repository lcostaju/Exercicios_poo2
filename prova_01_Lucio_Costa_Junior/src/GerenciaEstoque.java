import java.util.ArrayList;
import java.util.List;

public class GerenciaEstoque {
    private static List<Produto> produtos = new ArrayList<>();

    public static void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public static Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public static String listarProdutos() {
        StringBuilder sb = new StringBuilder();
        for (Produto produto : produtos) {
            sb.append("Nome: ").append(produto.getNome()).append("\n")
              .append("Preço: ").append(produto.getPreco()).append("\n")
              .append("Quantidade: ").append(produto.getQuantidade()).append("\n")
              .append("\n");
        }
        return sb.toString();
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }

    public static void setProdutos(List<Produto> produtos) {
        GerenciaEstoque.produtos = produtos;
    }


}
