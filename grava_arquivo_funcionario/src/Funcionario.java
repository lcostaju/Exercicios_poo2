import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public Funcionario() {
        //TODO Auto-generated constructor stub
    }

    public void salvar() throws IOException{
        BufferedWriter br = new BufferedWriter(new FileWriter("Funcionarios.txt",true));
        try {
            br.write("Nome:"+nome);
            br.newLine();
            br.write("Cargo:"+cargo);
            br.newLine();
            br.newLine();
            br.close();
        } catch (Exception e) {
            System.out.println("Houve um erro ao gerar o arquivo: " + e.getMessage());
        }
    }

    public String exibir(){
        StringBuilder conteudo = new StringBuilder();
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("Funcionarios.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append(System.lineSeparator());
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return conteudo.toString();
    }
}
