public class App {
    public static void main(String[] args) throws Exception {
        GeometriaPlana fig = new GeometriaPlana();
        fig.mudaParaCirculo();
        
        System.out.println(fig.exibe());

        fig.mudaParaQuadrado();

        System.out.println(fig.exibe());

        fig.mudaParaTriangulo();

        System.out.println(fig.exibe());
        
    }
}
