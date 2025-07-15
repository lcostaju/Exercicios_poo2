package Composite.comPadrao;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ComponenteSistemaArquivo {
    private String nome;
    private List<ComponenteSistemaArquivo> componentes = new ArrayList<>();

    public Pasta(String nome) { this.nome = nome; }

    public void adicionarComponente(ComponenteSistemaArquivo componente) {
        componentes.add(componente);
    }

    @Override
    public String getNome() { return nome; }

    @Override
    public double getTamanho() {
        double total = 0;
        for (ComponenteSistemaArquivo c : componentes) {
            total += c.getTamanho();
        }
        return total;
    }
}