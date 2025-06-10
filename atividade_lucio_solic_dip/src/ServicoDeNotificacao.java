public class ServicoDeNotificacao {
    private final ServicoDeEmail email;
    private final ServicoDeSMS sms;

    public ServicoDeNotificacao() {
        this.email = new ServicoDeEmail();
        this.sms = new ServicoDeSMS();
    }

    void notificaPorEmail(String mensagem, String destinatario){
        email.sendEmail(mensagem, destinatario);
    }

    void notificaPorSMS(String mensagem, String destinatario){
        sms.sendSMS(mensagem, destinatario);
    }

}
