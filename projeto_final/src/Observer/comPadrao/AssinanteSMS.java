package Observer.comPadrao;

public class AssinanteSMS implements Observador {
    @Override
    public void atualizar(String noticia) {
        System.out.println("SMS: Nova notícia - " + noticia);
    }
}