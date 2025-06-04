package ispsolucao;

import ispviolacao.*;

public class Gerente implements FuncionarioCeletista {

    @Override
    public String getCargo() {
        return "Gerente";
    }

    @Override
    public double calculaSalario() {
        // lógica para calcular o salario do gerente
        return 5000.00;
    }

    @Override
    public double calcula13o() {

        // lógica para calcular o décimo terceiro salario
        // do gerente

        return calculaSalario() / 12;
    }
}
