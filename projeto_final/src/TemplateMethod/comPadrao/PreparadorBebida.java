package TemplateMethod.comPadrao;

public abstract class PreparadorBebida {
    public final void prepararBebida() {
        ferverAgua();
        misturarIngredientePrincipal();
        despejarNaXicara();
        if (deveAdicionarCondimentos()) {
            adicionarCondimentos();
        }
    }

    private void ferverAgua() { System.out.println("Fervendo água..."); }
    private void despejarNaXicara() { System.out.println("Despejando na xícara..."); }

    protected abstract void misturarIngredientePrincipal();
    protected abstract void adicionarCondimentos();

    protected boolean deveAdicionarCondimentos() {
        return true;
    }
}