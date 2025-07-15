package Command.comPadrao;

public class LigarTVComando implements Comando {
    private TV tv;
    public LigarTVComando(TV tv) { this.tv = tv; }
    @Override
    public void executar() { tv.ligar(); }
}