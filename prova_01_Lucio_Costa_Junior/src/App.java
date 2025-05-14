import java.util.Scanner;
public class App {

    public static void menu(){
        System.out.println("M E N U");
        System.out.println("1- ADICIONA PRODUTO");
        System.out.println("2- COMPRA");
        System.out.println("3- VENDA");
        System.out.println("4- EXIBE TRANSAÇÕES");
        System.out.println("5- SAIR");
        System.out.print("ESCOLHA UMA OPÇÃO: ");
    }

    public static void subMenu(){
        /*
         * S U B M E N U
1- PRODUTO FÍSICO
2- PRODUTO DIGITAL
3- VOLTAR
ESCOLHA UMA OPÇÃO: _____
         */
        System.out.println("S U B M E N U");
        System.out.println("1- PRODUTO FÍSICO");
        System.out.println("2- PRODUTO DIGITAL");
        System.out.println("3- VOLTAR");
        System.out.print("ESCOLHA UMA OPÇÃO: ");
    }
    public static void main(String[] args) throws Exception {
    //    ProdutoFisico produtoFisico1 = new ProdutoFisico("lapis", 1.99, 10);
    //    ProdutoFisico produtoFisico2 = new ProdutoFisico("caneta", 2.99, 20);
    //    Compra compra = new Compra(produtoFisico2, 20);
    //    Venda venda = new Venda(produtoFisico2, 5);
    //    Venda venda2 = new Venda(produtoFisico2, 10);
       
    
    //    Compra compra2 = new Compra(produtoFisico2, 40);
    // // System.out.println("Produto: " + compra.getProduto().getNome());
    // // System.out.println("Preço: " + compra.getProduto().getPreco());
    // // System.out.println("Quantidade: " + compra.getQuantidade());
    
    // System.out.println(compra.executar());
    // System.out.println(venda.executar());
    // System.out.println(venda2.executar());
    // System.out.println(compra2.executar());
    
    // System.out.println(GerenciaEstoque.listarProdutos());
    Scanner s = new Scanner(System.in);
    int op = 0;
    int opSub = 0;

    while (op != 5) {
        menu();
        op = s.nextInt();
        switch (op) {
            case 1:
                subMenu();
                opSub = s.nextInt();
                while (opSub != 3) {
                    switch (opSub) {
                        case 1:
                            System.out.print("Nome do produto: ");
                            String nome = s.next();
                            System.out.print("Preço do produto: ");
                            double preco = s.nextDouble();
                            System.out.print("Quantidade do produto: ");
                            int quantidade = s.nextInt();
                            ProdutoFisico produtoFisico = new ProdutoFisico(nome, preco, quantidade);
                            GerenciaEstoque.adicionarProduto(produtoFisico);
                            System.out.println("Produto adicionado com sucesso!");
                            break;
                        case 2:
                            System.out.print("Nome do produto: ");
                            String nomeDigital = s.next();
                            System.out.print("Preço do produto: ");
                            double precoDigital = s.nextDouble();
                            Integer quantidadeDigital = Integer.MAX_VALUE;
                            ProdutoDigital produtoDigital = new ProdutoDigital(nomeDigital, precoDigital,quantidadeDigital);
                            GerenciaEstoque.adicionarProduto(produtoDigital);
                            System.out.println("Produto digital adicionado com sucesso!");
                            break;
                        case 3:
                            System.out.println("Voltando ao menu principal...");
                            break;    
                        default:
                            break;
                    }
                    
                    
                }
                break;
        
            default:
                break;
        }
    }

    }
}
