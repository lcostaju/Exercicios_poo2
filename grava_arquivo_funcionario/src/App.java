import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Integer op = 0;
        do {
            
            System.out.println("-------Menu-------");
            System.out.println("1 - Gravar");
            System.out.println("2 - Exibir");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção:__");
            op = s.nextInt();
            switch (op) {
                case 1:
                s.nextLine();
                    System.out.println("Digite o nome do funcionário");
                    String nome = s.nextLine();
                    System.out.println("Digite o cargo do funcionario");
                    String cargo = s.nextLine();
                    Funcionario funcionario = new Funcionario(nome, cargo);
                    funcionario.salvar();
                    break;
                case 2:
                    System.out.println(new Funcionario().exibir());
                    break;
                default:
                    break;
            }
        } while (op != 3);
        s.close();
    }
}
