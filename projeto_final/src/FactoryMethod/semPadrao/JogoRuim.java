package FactoryMethod.semPadrao;

class Inimigo {
    private String tipo;
    public Inimigo(String tipo) { this.tipo = tipo; }
    public void atacar() { System.out.println(tipo + " atacando!"); }
}

public class JogoRuim {
    public Inimigo criarInimigo(String tipo) {
        if ("Orc".equals(tipo)) {
            return new Inimigo("Orc");
        } else if ("Goblin".equals(tipo)) {
            return new Inimigo("Goblin");
        } else if ("Dragao".equals(tipo)) {
            return new Inimigo("Dragão");
        }
        return null;
    }
    // ... outras lógicas do jogo
}