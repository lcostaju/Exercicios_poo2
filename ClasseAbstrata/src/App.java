public class App {
    public static void main(String[] args) throws Exception {
        //Funcionario f1 = new Funcionario();
        Gerente g1 = new Gerente("Lucas", "123456", 2000.0);
        Vendedor v1 = new Vendedor("Lúcio", "654321", 1500.0, 10000.0);

        System.out.println("Salario Gerente: " + g1.calcularSalario());
        System.out.println("Salario Vendedor: " + v1.calcularSalario());
        
        
    }
}
