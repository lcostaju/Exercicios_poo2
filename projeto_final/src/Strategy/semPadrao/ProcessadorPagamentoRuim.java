package Strategy.semPadrao;

// Exemplo Simplificado (sem Strategy)
public class ProcessadorPagamentoRuim {
    public void processarPagamento(String tipoPagamento, double valor) {
        if ("cartaoCredito".equals(tipoPagamento)) {
            // Lógica para cartão de crédito
            System.out.println("Processando pagamento via Cartão de Crédito: " + valor);
        } else if ("paypal".equals(tipoPagamento)) {
            // Lógica para PayPal
            System.out.println("Processando pagamento via PayPal: " + valor);
        } else if ("boleto".equals(tipoPagamento)) {
            // Lógica para boleto
            System.out.println("Processando pagamento via Boleto: " + valor);
        } else {
            System.out.println("Tipo de pagamento inválido.");
        }
    }
}
// Problemas: Dificuldade de adicionar novos métodos de pagamento, viola o OCP (Open/Closed Principle).