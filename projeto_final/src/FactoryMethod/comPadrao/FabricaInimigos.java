package FactoryMethod.comPadrao;

public class FabricaInimigos {
    public static Inimigo criarInimigo(String tipo) {
        switch (tipo) {
            case "Orc": return new Orc();
            case "Goblin": return new Goblin();
            case "Dragao": return new Dragao();
            default: throw new IllegalArgumentException("Tipo de inimigo desconhecido: " + tipo);
        }
    }
}