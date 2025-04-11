import java.util.ArrayList;

public class media {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
            

        double soma = 0.0;
        numeros.add(10.0);
        numeros.add(9.5);
        numeros.add(9.0);
        numeros.add(8.75);
            
        System.out.println("Notas");
            for (double num : numeros) {
                System.out.print(num + " ");
            }
            for(int i = 0; i < numeros.size(); i++){
            
            soma += numeros.get(i);


            }
            double media = soma / numeros.size();
            System.out.println("\nMedia das notas: " + media);


        }
    }

