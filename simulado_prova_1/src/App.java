public class App {
    public static void main(String[] args) throws Exception {
        // 3) Cria um departamento de RH contendo 1 funcionário e 1 gerente

        try {
            // RH
            Departamento departamentoRh = new Departamento("RH");
            // Funcionarios
            departamentoRh.adicionarFuncionario(new Funcionario("Lucio", "111.111.136-17", 1581.56));

            // Gerente
            departamentoRh.adicionarFuncionario(new Gerente("Gomes", "111.666.555-89", 5000.69, 600.56));

            // Vendas
            Departamento departamentoVendas = new Departamento("Vendas");
            departamentoVendas.adicionarFuncionario(new Funcionario("Jorge", "122.111.136-17", 2581.56));

            // Gerente com bonus invalido
            departamentoRh.adicionarFuncionario(new Gerente("Rodolfo", "111.336.555-89",5000.69, -300.00));

            System.out.println(departamentoRh.listarFuncionarios());
            System.out.println(departamentoVendas.listarFuncionarios());
        } catch (SalarioInvalido e) {
            System.out.println(e.getMessage());
        }

        // Exibindo departamentos

    }
}
