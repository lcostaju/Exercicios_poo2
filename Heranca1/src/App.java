public class App {
    public static void main(String[] args) throws Exception {
        Aluno al = new Aluno("João", "123.456.789-00", 2000, 123456);

        System.out.println("Nome: " + al.getNome());
        System.out.println("CPF: " + al.getCpf());
        System.out.println("Data de nascimento: " + al.getData_nascimento());
        System.out.println("Matrícula: " + al.getMatricula());
        
    }
}
