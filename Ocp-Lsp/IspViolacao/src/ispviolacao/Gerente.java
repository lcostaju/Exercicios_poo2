package ispviolacao;

public class Gerente implements Funcionario{
    
    @Override
    public String getCargo(){
        return "Gerente";
    }
    
    @Override
    public double calculaSalario(){
// lógica para calcular o salario do gerente
        return 5000.00;
    }
    
    @Override
    public double calcula13o(Integer mesesTrabalhados){
// lógica para calcular o décimo terceiro salario 
         return (calculaSalario()/12)*mesesTrabalhados;                   // do gerente
    }
}
