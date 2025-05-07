import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario( Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public String listarFuncionarios(){
        String ListaFuncionarios = "Departamento: "+nome+"\n\n";

        for (Funcionario f : funcionarios) {
            ListaFuncionarios += f.mostrarDados();
        }

        ListaFuncionarios += "\n\n";

        return ListaFuncionarios;
    }
}
