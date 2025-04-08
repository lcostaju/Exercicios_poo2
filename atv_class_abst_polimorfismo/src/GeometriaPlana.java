public class GeometriaPlana {
    private Figura2D fig;

    public void mudaParaCirculo(){
        fig = new Circulo();
    }

    public void mudaParaQuadrado(){
        fig = new Quadrado();
    }

    public void mudaParaTriangulo(){
        fig = new Triangulo();
    }

    public String exibe(){
        return fig.pegaTexto();
    }
    
}
