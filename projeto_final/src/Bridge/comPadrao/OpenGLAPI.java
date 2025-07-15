package Bridge.comPadrao;

public class OpenGLAPI implements APIDesenho {
    @Override
    public void desenharCirculo(double raio) {
        System.out.println("Desenhando Círculo (raio " + raio + ") com OpenGL.");
    }
    @Override
    public void desenharRetangulo(double largura, double altura) {
        System.out.println("Desenhando Retângulo (l: " + largura + ", a: " + altura + ") com OpenGL.");
    }
}