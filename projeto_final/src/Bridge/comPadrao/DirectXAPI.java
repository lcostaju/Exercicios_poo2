package Bridge.comPadrao;

public class DirectXAPI implements APIDesenho {
    @Override
    public void desenharCirculo(double raio) {
        System.out.println("Desenhando Círculo (raio " + raio + ") com DirectX.");
    }
    @Override
    public void desenharRetangulo(double largura, double altura) {
        System.out.println("Desenhando Retangulo (l: " + largura + ", a: " + altura + ") com DirectX.");
    }
}