public class App {
    public static void main(String[] args) throws Exception {
        Aluno chico = new Aluno("Francisco", 29123, 10, "M", true);
        //chico.setNome("Douglas");
        System.out.println(chico.getNome());
        Aluno moedas = new Aluno("Francisco", 29123, 10, "M", true);
        //moedas.setNome("Douglas");
        System.out.println(moedas.getNome());
    }
}