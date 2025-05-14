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
                    if (opSub != 3) {
                        subMenu();
                        opSub = s.nextInt();
                    }
                    
                }
                break;
            case 2:
                subMenu();
                opSub = s.nextInt();
                while (opSub != 3) {
                    switch (opSub) {
                        case 1:
                            System.out.print("Nome do produto: ");
                            String nomeCompra = s.next();
                            System.out.print("Quantidade do produto: ");
                            Integer quantidadeCompra = s.nextInt();
                            Produto produtoFisicoCompra = GerenciaEstoque.buscarProduto(nomeCompra);
                            Compra compra = new Compra(produtoFisicoCompra, quantidadeCompra);
                            System.out.println(compra.executar());
                            break;
                        case 2:
                            System.out.print("Nome do produto: ");
                            String nomeCompraDig = s.next();
                            System.out.print("Quantidade do produto: ");
                            Integer qtdDig = 0;
                            Produto produtoDigitalCompra = GerenciaEstoque.buscarProduto(nomeCompraDig);
                            Compra compraDig = new Compra(produtoDigitalCompra, qtdDig);
                            System.out.println(compraDig.executar());
                            break;
                        case 3:
                            System.out.println("Voltando ao menu principal...");
                            break;    
                        default:
                            break;
                    }
                    if (opSub != 3) {
                        subMenu();
                        opSub = s.nextInt();
                    }
                }

            case 3:
                subMenu();
                opSub = s.nextInt();
                while (opSub != 3) {
                    switch (opSub) {
                        case 1:
                            System.out.print("Nome do produto: ");
                            String nomeVenda = s.next();
                            System.out.print("Quantidade do produto: ");
                            Integer quantidadeVenda = s.nextInt();
                            Produto produtoFisicoVenda = GerenciaEstoque.buscarProduto(nomeVenda);
                            Venda venda = new Venda(produtoFisicoVenda, quantidadeVenda);
                            try {
                                System.out.println(venda.executar());
                            } catch (Exception e) {
                                // TODO: handle exception
                                System.out.println("Erro: " + e.getMessage());
                            }
                            
                            break;
                        case 2:
                            System.out.print("Nome do produto: ");
                            String nomeVendaDig = s.next();
                            System.out.print("Quantidade do produto: ");
                            Integer qtdDig = 0;
                            Produto produtoDigitalVenda = GerenciaEstoque.buscarProduto(nomeVendaDig);
                            Venda vendaDig = new Venda(produtoDigitalVenda, qtdDig);
                            try {
                                System.out.println(vendaDig.executar());
                            } catch (Exception e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                            break;
                        case 3:
                            System.out.println("Voltando ao menu principal...");
                            break;    
                        default:
                            break;
                    }
                    if (opSub != 3) {
                        subMenu();
                        opSub = s.nextInt();
                    }
                }
                break;
            
            default:
                break;
        }
    }

    }
}
