package Singleton.comPadrao;

public class App {
    public static void main(String[] args) {
        GerenciadorConfiguracoes gc1 = GerenciadorConfiguracoes.getInstance();
        System.out.println(gc1.getSettings());

        gc1.setSettings("Novas configurações globais");

        GerenciadorConfiguracoes gc2 = GerenciadorConfiguracoes.getInstance();
        System.out.println(gc2.getSettings());
    }
}