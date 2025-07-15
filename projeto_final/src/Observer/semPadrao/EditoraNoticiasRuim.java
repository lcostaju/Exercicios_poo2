package Observer.semPadrao;

public class EditoraNoticiasRuim {
    public void publicarNoticia(String noticia) {
        System.out.println("Nova notícia publicada: " + noticia);
        new AssinanteEmail().receberNoticia(noticia);
        new AssinanteSMS().receberNoticia(noticia);
        // ... e assim por diante
    }
}