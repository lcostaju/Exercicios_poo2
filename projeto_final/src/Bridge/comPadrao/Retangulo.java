package Bridge.comPadrao;

public class Retangulo extends Forma {
    private double largura;
    private double altura;
    public Retangulo(double largura, double altura, APIDesenho apiDesenho) {
        super(apiDesenho);
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public void desenhar() {
        apiDesenho.desenharRetangulo(largura, altura);
    }
}