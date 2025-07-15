package TemplateMethod.comPadrao;

public class PreparadorCafe extends PreparadorBebida {
    @Override
    protected void misturarIngredientePrincipal() {
        System.out.println("Adicionando café em pó.");
    }
    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite.");
    }
}