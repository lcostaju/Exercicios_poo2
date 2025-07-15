package Observer.comPadrao;

import java.util.ArrayList;
import java.util.List;

public class Noticiario {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador o) { observadores.add(o); }
    public void removerObservador(Observador o) { observadores.remove(o); }

    public void setNovaNoticia(String noticia) {
        System.out.println("Publicando nova notícia: " + noticia);
        notificarObservadores(noticia);
    }

    private void notificarObservadores(String noticia) {
        for (Observador o : observadores) {
            o.atualizar(noticia);
        }
    }
}