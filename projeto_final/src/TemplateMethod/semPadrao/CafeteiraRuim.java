package TemplateMethod.semPadrao;

public class CafeteiraRuim {
    public void prepararCafeComum() {
        ferverAgua();
        adicionarCafeEmPo();
        despejarNaXicara();
        adicionarAcucar();
    }

    public void prepararCafeDescafeinado() {
        ferverAgua();
        adicionarCafeDescafeinadoEmPo();
        despejarNaXicara();
        adicionarAcucar();
    }

    private void ferverAgua() { System.out.println("Fervendo água..."); }
    private void adicionarCafeEmPo() { System.out.println("Adicionando café em pó..."); }
    private void adicionarCafeDescafeinadoEmPo() { System.out.println("Adicionando café descafeinado em pó..."); }
    private void despejarNaXicara() { System.out.println("Despejando na xícara..."); }
    private void adicionarAcucar() { System.out.println("Adicionando açúcar..."); }
}