package Command.comPadrao;

public class ControleRemoto {
    private Comando comando;
    public void setComando(Comando comando) { this.comando = comando; }
    public void pressionarBotao() { comando.executar(); }
}