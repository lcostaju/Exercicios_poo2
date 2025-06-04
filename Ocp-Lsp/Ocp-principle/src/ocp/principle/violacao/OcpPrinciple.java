package ocp.principle.violacao;

public class OcpPrinciple {

    public static void main(String[] args) {

        // 1) Ler dados de assaliariados e estagiarios (nome, tipo, remuneração)
        // exibir a folha de pagamento com o total pago aos funcionários

        Pagamento.setSalario(2000.50);
        Pagamento.setBolsaAuxilio(900.50);

        Funcionario assalariado = new Funcionario("Abel Braga", "assalariado", 2000.50);
        Funcionario estagiario = new Funcionario("Carlo Ancelotti", "estagiario", 900.50);

        FolhaPagamento folhaPagamento = new FolhaPagamento(0);

        folhaPagamento.calcular(assalariado);
        folhaPagamento.calcular(estagiario);

        System.out.println("Folha de pagamento total: "+folhaPagamento.getSaldo());

    }
    
}
