public class App {
    public static void main(String[] args) throws Exception {
        ServicoDeNotificacao notificacao = new ServicoDeNotificacao();

        notificacao.notificaPorEmail("sua fatura chegou", "cliente@email.com");
        notificacao.notificaPorSMS("Seu codigo é 1234", "11999999999");
    }
}
