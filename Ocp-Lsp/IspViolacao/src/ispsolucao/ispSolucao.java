package ispsolucao;

public class ispSolucao {
    public static void main(String[] args) {
        System.out.println("-- Calculo Estagiario");
        Estagiario estagiario = new Estagiario();
        estagiario.setInstituicaoEnsino("IFTM");
        System.out.println("Informaçoes do funcionario");
        System.out.println("Tipo: "+estagiario.getCargo());
        System.out.println("Salario: R$"+estagiario.calculaSalario());
        System.out.println("Instituição de ensino: "+estagiario.getInstituicaoEnsino());

        System.out.println("-- Calculo Programador");
        Programador programador = new Programador();
        System.out.println("Informaçoes do funcionario");
        System.out.println("Tipo: "+programador.getCargo());
        System.out.println("Salario: R$"+programador.calculaSalario());
        System.out.println("Calculo 13º (multiplicar por meses trabalhados) R$"+programador.calcula13o());

        System.out.println("-- Calculo Gerente");
        Gerente gerente = new Gerente();
        System.out.println("Informaçoes do funcionario");
        System.out.println("Tipo: "+gerente.getCargo());
        System.out.println("Salario: R$"+gerente.calculaSalario());
        System.out.println("Calculo 13º (multiplicar por meses trabalhados) R$"+gerente.calcula13o());

    }
}
