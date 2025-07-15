package Bridge.comPadrao;

public class App {
    public static void main(String[] args) {
        APIDesenho openGL = new OpenGLAPI();
        APIDesenho directX = new DirectXAPI();

        Forma circuloOpenGL = new Circulo(5.0, openGL);
        circuloOpenGL.desenhar();

        Forma retanguloDirectX = new Retangulo(10.0, 20.0, directX);
        retanguloDirectX.desenhar();

        Forma circuloDirectX = new Circulo(7.0, directX);
        circuloDirectX.desenhar();
    }
}