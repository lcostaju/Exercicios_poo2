package Composite.semPadrao;

import java.util.List;

public class SistemaArquivoRuim {
    public double calcularTamanhoArquivo(String nomeArquivo) {
        // Lógica para arquivo
        return 10.0; // Exemplo de tamanho
    }

    public double calcularTamanhoPasta(List<String> arquivos, List<SistemaArquivoRuim> subpastas) {
        double total = 0;
        for (String arquivo : arquivos) {
            total += calcularTamanhoArquivo(arquivo);
        }
        for (SistemaArquivoRuim subpasta : subpastas) {
            // Problema: Aqui a lógica é diferente para pastas, não há uma interface comum.
            // total += subpasta.calcularTamanhoPasta(...); // Como chamar?
        }
        return total;
    }
}