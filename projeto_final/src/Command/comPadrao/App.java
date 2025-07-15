package Command.comPadrao;

public class App {
    public static void main(String[] args) {
        TV minhaTV = new TV();
        Comando ligar = new LigarTVComando(minhaTV);
        Comando desligar = new DesligarTVComando(minhaTV);

        ControleRemoto controle = new ControleRemoto();

        controle.setComando(ligar);
        controle.pressionarBotao();

        controle.setComando(desligar);
    }
}