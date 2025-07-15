package FactoryMethod.comPadrao;

public class App {
    public static void main(String[] args) {
        Inimigo inimigo1 = FabricaInimigos.criarInimigo("Orc");
        inimigo1.atacar();

        Inimigo inimigo2 = FabricaInimigos.criarInimigo("Dragao");
        inimigo2.atacar();
    }
}