package Command.comPadrao;

public class DesligarTVComando implements Comando {
    private TV tv;
    public DesligarTVComando(TV tv) { this.tv = tv; }
    @Override
    public void executar() { tv.desligar(); }
}