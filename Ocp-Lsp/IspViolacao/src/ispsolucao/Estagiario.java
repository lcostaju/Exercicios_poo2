package ispsolucao;

import ispviolacao.*;

public class Estagiario implements FuncionarioEstagiario{

    private String instituicaoEnsino;

    
    @Override
    public String getCargo(){
        return "Estagiário";
    }
    
    @Override
    public double calculaSalario(){
// lógica para calcular o salario do estagiário
        return 1000.00;
    }
     
    @Override
    public void setInstituicaoEnsino(String instituicao){
//  lógica para setar a instituição de ensino do estagiário 
        instituicaoEnsino = instituicao;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    
}
