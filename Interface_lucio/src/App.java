public class App {
    public static void main(String[] args) throws Exception {
       //1 - Instanciar a classe Conta Poupança
        
       System.out.println("Criando conta poupanca com saldo de R$1000");
       ContaPoupanca contaPoup = new ContaPoupanca(1000);

       //2 - Instanciar a classe Conta Corrente
       System.out.println("Criando conta Corrente com saldo de R$5000 e taxa de 0.1");
       ContaCorrente contaCorr = new ContaCorrente(5000, 0.1);

       //3 - Realizar 1 deposito e  um saque em cada conta

       //Conta poupança
       System.out.println("Depositando R$6000 na conta poupança");
       contaPoup.depositar(6000);
       //System.out.println(new GeradorExtrato().geradorConta(contaPoup));
       System.out.println("Sacando R$350,50 da conta poupança");
       contaPoup.sacar(350.5);

       //Conta corrente
       System.out.println("Depositando R$15000 na conta corrente");
       contaCorr.depositar(15000);
       //System.out.println(new GeradorExtrato().geradorConta(contaPoup));
       System.out.println("Sacando R$1000 da conta corrente");
       contaCorr.sacar(1000);
       
        
       //4 - Exibir o saldo de cada uma delas
        GeradorExtrato geraExtrato = new GeradorExtrato();
       System.out.println("Saldo conta poupança:");
       System.out.println(geraExtrato.geradorConta(contaPoup));
       
       System.out.println("Saldo conta corrente:");
       System.out.println(geraExtrato.geradorConta(contaCorr));
    }
}
