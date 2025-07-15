package Composite.comPadrao;

public class App {
    public static void main(String[] args) {
        Arquivo arquivo1 = new Arquivo("documento.txt", 10.5);
        Arquivo arquivo2 = new Arquivo("imagem.jpg", 25.0);
        Arquivo arquivo3 = new Arquivo("planilha.xls", 15.0);

        Pasta subpasta1 = new Pasta("Documentos Importantes");
        subpasta1.adicionarComponente(arquivo1);
        subpasta1.adicionarComponente(arquivo3);

        Pasta pastaRaiz = new Pasta("Meus Arquivos");
        pastaRaiz.adicionarComponente(arquivo2);
        pastaRaiz.adicionarComponente(subpasta1);

        System.out.println("Tamanho total da pasta 'Meus Arquivos': " + pastaRaiz.getTamanho() + " MB");
        System.out.println("Tamanho do arquivo 'imagem.jpg': " + arquivo2.getTamanho() + " MB");
    }
}