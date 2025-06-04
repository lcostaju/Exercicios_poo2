
package ispviolacao;

/**
 *
 * @author Clarimundo
 */
public class IspViolacao {

    
    public static void main(String[] args) {
         // lógica da aplicação

         System.out.println("-- Calculo Programador --");
         Programador programador = new Programador();
         System.out.println("Salario do funcionario: ");
         System.out.println(programador.getCargo());
         System.out.println("Slario R$"+programador.calculaSalario());
         System.out.println("13º do funcionario");
         System.out.println("13º R$"+programador.calcula13o(11));

         System.out.println("-- Calculo gerente --");
         Gerente gerente = new Gerente();
         System.out.println("Salario do funcionario: ");
         System.out.println(gerente.getCargo());
         System.out.println("Slario R$"+gerente.calculaSalario());
         System.out.println("13º do funcionario");
         System.out.println("13º R$"+gerente.calcula13o(11));

         System.out.println("-- Calculo estagiario --");
         Estagiario estagiario = new Estagiario();
         System.out.println("Salario do funcionario: ");
         System.out.println(estagiario.getCargo());
         System.out.println("Slario R$"+estagiario.calculaSalario());
         System.out.println("13º do funcionario");
         System.out.println("13º R$"+estagiario.calcula13o(11));

    }
    
}
