package TemplateMethod.comPadrao;

public class App {
    public static void main(String[] args) {
        System.out.println("Preparando café:");
        PreparadorBebida cafe = new PreparadorCafe();
        cafe.prepararBebida();

        System.out.println("\nPreparando chá:");
        PreparadorBebida cha = new PreparadorCha();
        cha.prepararBebida();
    }
}