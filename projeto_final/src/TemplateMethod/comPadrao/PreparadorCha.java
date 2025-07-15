package TemplateMethod.comPadrao;

public class PreparadorCha extends PreparadorBebida {
    @Override
    protected void misturarIngredientePrincipal() {
        System.out.println("Adicionando saquinho de chá.");
    }
    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando limão.");
    }
    @Override
    protected boolean deveAdicionarCondimentos() {
        return false;
    }
}