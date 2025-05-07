public class Gerente extends Funcionario{

    private Double bonus;

    public Gerente(String nome, String cpf, Double salarioBase,Double bonus) throws SalarioInvalido {
        super(nome, cpf, salarioBase);
        if(bonus < 0)
            throw new SalarioInvalido("Bonus não pode ser negativo");
        this.bonus = bonus;
    }

    @Override
    public Double calcularSalario(){
        return bonus + salarioBase;
    }

    @Override
    public String mostrarDados(){
        // return String.format("Nome: %s, CPF: %s, Salário Total: %s", 
        //     nome, cpf, Util.formatarMoeda(calcularSalario()));
        return "Gerente: "+nome+"\n"+
        "CPF: "+cpf+"\n"+
        "Salario Base: "+salarioBase+"\n"+
        "Salario calculado: "+Util.formatarMoeda(calcularSalario())+"\n"+
        "---\n";
    }
}
