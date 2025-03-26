public class MinhasExcecoes extends Exception {
    
    private String mensagem;

    public MinhasExcecoes(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Não foi possivel realizar a operação: " + mensagem;
    }
    
}
