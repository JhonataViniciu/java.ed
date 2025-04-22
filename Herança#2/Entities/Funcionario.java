public class Funcionario {
    protected String nome;
    protected String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public double calculaSalario() {
        return 0;
    }

    public void mostra() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }
}
