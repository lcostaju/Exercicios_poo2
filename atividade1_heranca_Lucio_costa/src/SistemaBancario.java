import java.util.Scanner;

public class SistemaBancario {

    public static void menu() {
        System.out.println("Escolha um tipo de conta");
        System.err.println("1 - Conta Bancaria");
        System.out.println("2 - Conta Corrente");
        System.out.println("3 - Conta Poupança Estudantil");
        System.out.println("4 - Conta Corrente Premium");
        System.out.println("5 - Conta Corrente Empresarial");
        System.out.println("6 - Conta Poupança");
        // Sair
        System.out.println("0 - Sair");

    }

    public static void subMenu1() {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver Saldo");
        System.out.println("4 - Sair");
    }

    public static void subMenu2() {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver Saldo");
        System.out.println("4 - Exibe limite cheque especial");
        System.out.println("5 - Sair");
    }

    public static void subMenu3() {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver Saldo");
        System.out.println("4 - Aplicar rendimento");
        System.out.println("5 - Sair");
    }

    public static void subMenu4() {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver Saldo");
        System.out.println("4 - Exibe beneficio premium");
        System.out.println("5 - Sair");
    }

    public static void subMenu5() {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver Saldo");
        System.out.println("4 - Solicitar empréstimo");
        System.out.println("5 - Sair");
    }

    public static void subMenu6() {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver Saldo");
        System.out.println("4 - Aplicar rendimento");
        System.out.println("5 - Sair");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao = -1;
        int subOp = -1;

        while (opcao != 0) {
            menu();
            opcao = s.nextInt();
            switch (opcao) {
                case 1:
                    ContaBancaria contaBancaria = new ContaBancaria("Joao da silva", 2000.00);
                    subMenu1();
                    subOp = s.nextInt();
                    while (subOp != 4) {
                        switch (subOp) {
                            case 1:
                                System.out.println("Digite o valor a ser depositado: ");
                                double valorDeposito = s.nextDouble();
                                contaBancaria.depositar(valorDeposito);
                                System.out.println("Depósito realizado com sucesso!");
                                break;
                            case 2:
                                System.out.println("Digite o valor a ser sacado: ");
                                double valorSaque = s.nextDouble();
                                // Se o retorno do metodo sacar for false deve ser lançada uma exceção
                                try {
                                    if (!contaBancaria.sacar(valorSaque)) {
                                        throw new MinhasExcecoes("Saldo insuficiente!");
                                    } else {
                                        System.out.println("Saque realizado com sucesso!");
                                    }
                                } catch (MinhasExcecoes e) {
                                    System.out.println(e.toString());
                                }

                                break;
                            case 3:
                                System.out.println("Seu saldo é: " + contaBancaria.getSaldo());
                                break;
                            case 4:
                                System.out.println("Saindo do sistema...");
                                break;
                        }
                        subMenu1();
                        subOp = s.nextInt();
                    }

                    break;
                case 2:
                    ContaCo contaCo = new ContaCo(200, "Maria das Dores", 30000.00);
                    subMenu2();
                    subOp = s.nextInt();
                    while (subOp != 5) {
                        switch (subOp) {
                            case 1:
                                System.out.println("Digite o valor a ser depositado: ");
                                double valorDeposito = s.nextDouble();
                                contaCo.depositar(valorDeposito);
                                System.out.println("Depósito realizado com sucesso!");
                                break;
                            case 2:
                                System.out.println("Digite o valor a ser sacado: ");
                                double valorSaque = s.nextDouble();
                                // Se o retorno do metodo sacar for false deve ser lançada uma exceção
                                try {
                                    if (!contaCo.sacar(valorSaque)) {
                                        throw new MinhasExcecoes("Saldo insuficiente!");
                                    } else {
                                        System.out.println("Saque realizado com sucesso!");
                                    }
                                } catch (MinhasExcecoes e) {
                                    System.out.println(e.toString());
                                }

                                break;
                            case 3:
                                System.out.println("Seu saldo é: " + contaCo.getSaldo());
                                break;
                            case 4:
                                System.out.println(contaCo.exibeLimiteChequeEspecial());
                                break;
                            case 5:
                                System.out.println("Saindo do sistema...");
                                break;
                        }
                        subMenu2();
                        subOp = s.nextInt();
                    }

                    break;
                case 3:
                    ContaPoEstudantil contaPoEstudantil = new ContaPoEstudantil(1000, 0.5, "Ana Maria", 2000.00);
                    subMenu3();
                    subOp = s.nextInt();
                    while (subOp != 5) {
                        switch (subOp) {
                            case 1:
                                System.out.println("Digite o valor a ser depositado: ");
                                double valorDeposito = s.nextDouble();
                                contaPoEstudantil.depositar(valorDeposito);
                                System.out.println("Depósito realizado com sucesso!");
                                break;
                            case 2:
                                System.out.println("Digite o valor a ser sacado: ");
                                double valorSaque = s.nextDouble();
                                // Se o retorno do metodo sacar for false deve ser lançada uma exceção
                                try {
                                    if (!contaPoEstudantil.sacar(valorSaque)) {
                                        throw new MinhasExcecoes("Saldo insuficiente!");
                                    } else {
                                        System.out.println("Saque realizado com sucesso!");
                                    }
                                } catch (MinhasExcecoes e) {
                                    System.out.println(e.toString());
                                }

                                break;
                            case 3:
                                System.out.println("Seu saldo é: " + contaPoEstudantil.getSaldo());
                                break;
                            case 4:
                                contaPoEstudantil.aplicarRendimento();
                                System.out.println("Rendimento aplicado com sucesso!");
                                break;
                            case 5:
                                System.out.println("Saindo do sistema...");
                                break;
                        }
                        subMenu3();
                        subOp = s.nextInt();
                    }

                    break;
                case 4:
                    ContaCoPremium contaCoPremium = new ContaCoPremium(5, 200, "Carlos Silva", 30000.00);
                    subMenu4();
                    subOp = s.nextInt();
                    while (subOp != 5) {
                        switch (subOp) {
                            case 1:
                                System.out.println("Digite o valor a ser depositado: ");
                                double valorDeposito = s.nextDouble();
                                contaCoPremium.depositar(valorDeposito);
                                System.out.println("Depósito realizado com sucesso!");
                                break;
                            case 2:
                                System.out.println("Digite o valor a ser sacado: ");
                                double valorSaque = s.nextDouble();
                                // Se o retorno do metodo sacar for false deve ser lançada uma exceção
                                try {
                                    if (!contaCoPremium.sacar(valorSaque)) {
                                        throw new MinhasExcecoes("Saldo insuficiente!");
                                    } else {
                                        System.out.println("Saque realizado com sucesso!");
                                    }
                                } catch (MinhasExcecoes e) {
                                    System.out.println(e.toString());
                                }

                                break;
                            case 3:
                                System.out.println("Seu saldo é: " + contaCoPremium.getSaldo());
                                break;
                            case 4:
                                System.out.println(contaCoPremium.exibeBeneficioPremium());
                                break;
                            case 5:
                                System.out.println("Saindo do sistema...");
                                break;
                        }
                        subMenu4();
                        subOp = s.nextInt();
                    }

                    break;
                case 5:
                    ContaCoEmpresarial contaCoEmpresarial = new ContaCoEmpresarial(1000, 200, "Roberto Carlos",
                            30000.00);
                    subMenu5();
                    subOp = s.nextInt();
                    while (subOp != 5) {
                        switch (subOp) {
                            case 1:
                                System.out.println("Digite o valor a ser depositado: ");
                                double valorDeposito = s.nextDouble();
                                contaCoEmpresarial.depositar(valorDeposito);
                                System.out.println("Depósito realizado com sucesso!");
                                break;
                            case 2:
                                System.out.println("Digite o valor a ser sacado: ");
                                double valorSaque = s.nextDouble();
                                // Se o retorno do metodo sacar for false deve ser lançada uma exceção
                                try {
                                    if (!contaCoEmpresarial.sacar(valorSaque)) {
                                        throw new MinhasExcecoes("Saldo insuficiente!");
                                    } else {
                                        System.out.println("Saque realizado com sucesso!");
                                    }
                                } catch (MinhasExcecoes e) {
                                    System.out.println(e.toString());
                                }

                                break;
                            case 3:
                                System.out.println("Seu saldo é: " + contaCoEmpresarial.getSaldo());
                                break;
                            case 4:
                                System.out.println("Digite o valor do empréstimo: ");
                                double valorEmprestimo = s.nextDouble();
                                try {
                                    if (!contaCoEmpresarial.solicitaEmprestimo(valorEmprestimo)) {
                                        throw new MinhasExcecoes("Empréstimo não autorizado!");
                                    } else {
                                        System.out.println("Empréstimo solicitado com sucesso!");
                                    }
                                } catch (MinhasExcecoes e) {
                                    System.out.println(e.toString());
                                }
                                break;
                            case 5:
                                System.out.println("Saindo do sistema...");
                                break;
                        }
                        subMenu5();
                        subOp = s.nextInt();
                    }

                    break;
                case 6:
                    ContaPo contaPoupanca = new ContaPo(0.5, "Ana Maria", 2000.00);
                    subMenu6();
                    subOp = s.nextInt();
                    while (subOp != 5) {
                        switch (subOp) {
                            case 1:
                                System.out.println("Digite o valor a ser depositado: ");
                                double valorDeposito = s.nextDouble();
                                contaPoupanca.depositar(valorDeposito);
                                System.out.println("Depósito realizado com sucesso!");
                                break;
                            case 2:
                                System.out.println("Digite o valor a ser sacado: ");
                                double valorSaque = s.nextDouble();
                                // Se o retorno do metodo sacar for false deve ser lançada uma exceção
                                try {
                                    if (!contaPoupanca.sacar(valorSaque)) {
                                        throw new MinhasExcecoes("Saldo insuficiente!");
                                    } else {
                                        System.out.println("Saque realizado com sucesso!");
                                    }
                                } catch (MinhasExcecoes e) {
                                    System.out.println(e.toString());
                                }

                                break;
                            case 3:
                                System.out.println("Seu saldo é: " + contaPoupanca.getSaldo());
                                break;
                            case 4:
                                contaPoupanca.aplicarRendimento();
                                System.out.println("Rendimento aplicado com sucesso!");
                                break;
                            // case 5:
                            //     System.out.println("Saindo do sistema...");

                            //     break;

                            default:
                                System.out.println("Saindo do sistema...");
                                break;
                            
                              
                        }
                        subMenu6();
                        subOp = s.nextInt();
                    }

            }
            menu();
            opcao = s.nextInt();
            subOp = -1;
        }
    }
}
