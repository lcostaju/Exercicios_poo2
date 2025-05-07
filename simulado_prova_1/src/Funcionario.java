public class Funcionario extends Pessoa implements Pagavel{
    protected Double salarioBase;
    
    public Funcionario(String nome, String cpf,Double salarioBase) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
    }

    @Override
    public Double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String mostrarDados() {
        
        return "Funcionario: "+nome+"\n"+
        "CPF: "+cpf+"\n"+
        "Salario Base: "+salarioBase+"\n"+
        "Salario calculado: "+Util.formatarMoeda(calcularSalario())+"\n"+
        "---\n";

        //"Nome:"+nome+", CPF:"+cpf+", Salário Base:"+Util.formatarMoeda(salarioBase);
    }

    public Double calcularSalario(Double bonus){
        return salarioBase + bonus;
    }

}
