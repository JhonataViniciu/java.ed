public class Analista extends Funcionario {
    private double[] valorPorProjeto;

    public Analista(String nome, String matricula, double[] valorPorProjeto) {
        super(nome, matricula);
        this.valorPorProjeto = valorPorProjeto;
    }

    public double calculaSalario() {
        double total = 0;
        for (double valor : valorPorProjeto) {
            total += valor;
        }
        return total;
    }
}
