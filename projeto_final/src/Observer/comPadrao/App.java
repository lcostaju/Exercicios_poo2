package Observer.comPadrao;

public class App {
    public static void main(String[] args) {
        Noticiario noticiario = new Noticiario();

        AssinanteEmail email = new AssinanteEmail();
        AssinanteSMS sms = new AssinanteSMS();

        noticiario.adicionarObservador(email);
        noticiario.adicionarObservador(sms);

        noticiario.setNovaNoticia("Novo recorde de vendas de carros!");
        noticiario.removerObservador(sms);
    }
}