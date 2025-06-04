package ispviolacao;

public class Programador implements Funcionario {
    
    @Override
    public String getCargo(){
        return "Programador";
    }
    
    @Override
    public double calculaSalario(){
// lógica para calcular o salario do programador
        return 3000.00;            
    }
        
    @Override
    public double calcula13o(Integer mesesTrabalhados){
// lógica para calcular o décimo terceiro salario
        return (calculaSalario()/12)*mesesTrabalhados;                //do programador
    }    
}
