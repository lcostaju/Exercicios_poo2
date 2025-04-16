package prodPlan;

public class Teste {

    /**
     * MÉTODO estático que escreve na saída padrão o conteúdo de um vetor de objetos
     * Item,
     * devidamente convertidos para String.
     * 
     * @param titulo texto apresentado antes da listagem.
     * @param itens  vetor de objetos Item a ser listado.
     */
    static void listaItens(String titulo, Item[] itens) {
        float valorTotal = 0;
        System.out.println(titulo);

        for (Item item : itens) {
            valorTotal += item.calculaValor();
            System.out.println(item.toString());
        }

        System.out.println("Valor total:"+valorTotal);
    }

    /**
     * MÉTODO estático do tipo void que escreve na saída padrão o conteúdo de um
     * vetor de
     * objetos Parte devidamente convertidos para String.
     * 
     * @param titulo texto a ser mostrado antes da listagem
     * @param partes vetor de objetos Parte a ser listado
     */
    static void listaPartes(String titulo, Parte[] partes) {

        System.out.println(titulo);

        for (Parte parte : partes) {
            System.out.println(parte.toString());
        }
    }

    /**
     * MÉTODO estático que cria um vetor de objetos Item a ser usado nos testes
     * 
     * @param partes vetor de objetos Parte a partir do qual serao criados os
     *               objetos Item que
     *               formarão o vetor
     * @return vetor de objetos Item
     */
    static Item[] criaItens(Parte[] partes) {

        Item[] itens = new Item[] {
                new Item(partes[0], 10), // cod:112
                new Item(partes[5], 50), // cod:232
                new Item(partes[7], 30), // cod:234
                new Item(partes[2], 5) // cod:111
        };
        return itens;
    }

    static Parte[] criaPartes() {
        return new Parte[] {
                new Motor(112, "motor m112", "motor de avanco do cabecote", 100.0f, 1.2f, 1.1f, 1250),
                new Motor(114, "motor m114", "motor auxiliar", 60.0f, 0.6f, 0.8f, 1250),
                new Motor(111, "motor m111", "motor de ventilador", 70.0f, 1.0f, 1.0f, 3000),
                new Motor(110, "motor m110", "motor principal", 120.0f, 1.8f, 1.5f, 1250),
                new Parafuso(231, "parafuso p1", "parafuso de fixacao do cabecote", 2.5f, 100.0f, 8.0f),
                new Parafuso(232, "parafuso p2", "parafuso de fixacao do motor", 2.5f, 80.0f, 6.0f),
                new Parafuso(233, "parafuso p3", "parafuso de fixacao do ventilador", 2.0f, 60.0f, 6.0f),
                new Parafuso(234, "parafuso p4", "parafuso de uso geral", 3.0f, 120.0f, 12.0f)
        };
    }

    /**
     * MÉTODO principal que dispara os testes.
     * 
     * @param args o de sempre.
     */
    public static void main(String[] args) {
        Parte[] partes = criaPartes();
        Item[] itens = criaItens(partes);
        listaPartes("*** Partes utilizadas na producao ****", partes);
        listaItens("*** Itens solicitados ***", itens);
    }

}
