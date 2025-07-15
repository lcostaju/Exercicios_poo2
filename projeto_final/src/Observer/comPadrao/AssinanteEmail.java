package Observer.comPadrao;

public class AssinanteEmail implements Observador {
    @Override
    public void atualizar(String noticia) {
        System.out.println("Email: Nova notícia - " + noticia);
    }
}