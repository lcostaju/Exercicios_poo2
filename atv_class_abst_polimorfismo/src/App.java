public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Atividade 1");
        GeometriaPlana fig = new GeometriaPlana();
        fig.mudaParaCirculo();
        
        System.out.println(fig.exibe());

        fig.mudaParaQuadrado();

        System.out.println(fig.exibe());

        fig.mudaParaTriangulo();

        System.out.println(fig.exibe());

        System.out.println("Atividade 2");

        Figura2D fig1[] = new Figura2D[3];

        fig1[0] = new Circulo();
        fig1[1] = new Quadrado();
        fig1[2] = new Triangulo();

        for (Figura2D figura2d : fig1) {
            System.out.println(figura2d.pegaTexto());
        }
    
        };

}
