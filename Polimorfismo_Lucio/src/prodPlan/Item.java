package prodPlan;

public class Item {
    private Parte parte;
    private int quantidade;

    public Item(Parte parte, int quantidade) {
        this.parte = parte;
        this.quantidade = quantidade;
    }

    public float calculaValor(){
        return parte.getValor() * quantidade;
    }

    public String toString(){
        return "cod:"+ parte.getCod() +
                " nome:" + parte.getNome() +
                " quantidade:" + quantidade +
                " valor unitario:" + parte.getValor() +
                " valor:" + calculaValor();
    }
}
