import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da circunferência: ");
        double raio = sc.nextDouble();
        Circunferencia c = new Circunferencia(raio);

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        Retangulo r = new Retangulo(base, altura);

        System.out.println("\n--- Circunferência ---");
        c.mostra();

        System.out.println("\n--- Retângulo ---");
        r.mostra();
    }
}
