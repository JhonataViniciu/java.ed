public class Programador extends Funcionario {
    private double valorHora;
    private int qtdeHoras;

    public Programador(String nome, String matricula, double valorHora, int qtdeHoras) {
        super(nome, matricula);
        this.valorHora = valorHora;
        this.qtdeHoras = qtdeHoras;
    }

    public double calculaSalario() {
        return valorHora * qtdeHoras;
    }
}
