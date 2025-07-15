package Bridge.comPadrao;

public abstract class Forma {
    protected APIDesenho apiDesenho;
    protected Forma(APIDesenho apiDesenho) { this.apiDesenho = apiDesenho; }
    public abstract void desenhar();
}