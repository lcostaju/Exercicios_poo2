package Singleton.semPadrao;

public class App {
    public static void main(String[] args) {
        GerenciadorConfiguracoesRuim gc1 = new GerenciadorConfiguracoesRuim();
        System.out.println(gc1.getSettings());

        GerenciadorConfiguracoesRuim gc2 = new GerenciadorConfiguracoesRuim();
        gc2.setSettings("Novas configurações para gc2");
        System.out.println(gc1.getSettings());
    }
}