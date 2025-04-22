import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do analista: ");
        String nomeA = sc.nextLine();
        System.out.print("Matrícula do analista: ");
        String matA = sc.nextLine();

        double[] projetos = new double[3]; 
        for (int i = 0; i < projetos.length; i++) {
            System.out.print("Valor do projeto " + (i+1) + ": ");
            projetos[i] = sc.nextDouble();
        }
        Analista a = new Analista(nomeA, matA, projetos);

        sc.nextLine(); 

        System.out.print("\nNome do programador: ");
        String nomeP = sc.nextLine();
        System.out.print("Matrícula do programador: ");
        String matP = sc.nextLine();
        System.out.print("Valor da hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Quantidade de horas: ");
        int horas = sc.nextInt();
        Programador p = new Programador(nomeP, matP, valorHora, horas);

        System.out.println("\n--- Analista ---");
        a.mostra();
        System.out.println("Salário: R$ " + a.calculaSalario());

        System.out.println("\n--- Programador ---");
        p.mostra();
        System.out.println("Salário: R$ " + p.calculaSalario());
    }
}
