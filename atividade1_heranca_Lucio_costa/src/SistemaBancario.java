import java.util.Scanner;

public class SistemaBancario {

    public static void menu() {
        System.out.println("Escolha um tipo de conta");
        System.out.println("1 - Conta Poupança");
        System.out.println("2 - Conta Corrente");
        System.out.println("3 - Conta Poupança Estudantil");
        System.out.println("4 - Conta Corrente Especial");
        System.out.println("5 - Conta Corrente Empresarial");
        System.err.println("6 - Conta Bancaria");
        // Sair
        System.out.println("0 - Sair");

    }

    public static void subMenu1(){
        System.out.println("Escolha uma opção");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver Saldo");
        System.out.println("4 - Sair");
    }

    public static void subMenu2(){
        System.out.println("Escolha uma opção");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver Saldo");
        System.out.println("4 - Exibe limite cheque especial");
        System.out.println("5 - Sair");
    }

    public static void subMenu3(){
        System.out.println("Escolha uma opção");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver Saldo");
        System.out.println("4 - Aplicar rendimento");
        System.out.println("5 - Sair");
    }

    public static void subMenu4(){
        System.out.println("Escolha uma opção");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver Saldo");
        System.out.println("4 - Exibe beneficio premium");
        System.out.println("5 - Sair");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            menu();
            opcao = s.nextInt();
            switch (opcao) {
                case 1:


                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    ;
            }
        }

    }
}
