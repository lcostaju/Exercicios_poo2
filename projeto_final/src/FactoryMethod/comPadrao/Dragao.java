package FactoryMethod.comPadrao;

public class Dragao implements Inimigo {
    @Override
    public void atacar() {
        System.out.println("Dragão cuspindo fogo!");
    }
}