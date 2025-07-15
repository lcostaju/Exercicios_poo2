package Bridge.comPadrao;

public class Circulo extends Forma {
    private double raio;
    public Circulo(double raio, APIDesenho apiDesenho) {
        super(apiDesenho);
        this.raio = raio;
    }
    @Override
    public void desenhar() {
        apiDesenho.desenharCirculo(raio);
    }
}