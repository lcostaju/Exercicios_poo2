package Singleton.semPadrao;

public class GerenciadorConfiguracoesRuim {
    private String settings;
    public GerenciadorConfiguracoesRuim() {
        this.settings = "Configurações padrão (nova instância)";
    }
    public String getSettings() { return settings; }
    public void setSettings(String settings) { this.settings = settings; }
}