package ocp.principle.solucao;

public class OcpPrinciple {

    public static void main(String[] args) {

        // 1) Ler dados de assaliariados e estagiarios (nome, tipo, remuneração)
        // exibir a folha de pagamento com o total pago aos funcionários

        ContratoCLT contratoClt = new ContratoCLT(2000.00);
        ContratoEstagio contratoEstagio = new ContratoEstagio(900.00);

        FolhaPagamento folhaPagamento = new FolhaPagamento(0);

        folhaPagamento.calcular(contratoClt);
        folhaPagamento.calcular(contratoEstagio);

        System.out.println("Total pago aos funcionarios: R$"+folhaPagamento.getSaldo());

    }
    
}
