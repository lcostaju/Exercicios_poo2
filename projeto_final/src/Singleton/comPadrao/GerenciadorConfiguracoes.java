package Singleton.comPadrao;

public class GerenciadorConfiguracoes {
    private static GerenciadorConfiguracoes instancia;
    private String settings;

    private GerenciadorConfiguracoes() {
        this.settings = "Configurações padrão";
    }

    public static GerenciadorConfiguracoes getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorConfiguracoes();
        }
        return instancia;
    }

    public String getSettings() { return settings; }
    public void setSettings(String settings) { this.settings = settings; }
}