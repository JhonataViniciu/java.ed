import java.util.Random;

public class tigrinho {
    public static void main(String[] args) {
        new tigrinho();
    }

    public tigrinho() {
        float vet[] = new float[10];
        for (int i=0; i < vet.length; i++) {
            vet[i] = geraFloat();
        }
        System.out.println("Números sorteados");
        visualizarVetor(vet);
        sorteio();
    }

    public void sorteio() {
        Random rnd = new Random();
        int n1, n2, n3;
        n1 = rnd.nextInt(9);
        n2 = rnd.nextInt(9);
        n3 = rnd.nextInt(9);
        System.out.println(n1 + " " + n2 + " " + n3);
    }
    
    public void visualizarVetor(float[] vetor) {
        for (float num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public float geraFloat() {
        Random rnd = new Random();
        //  aleatorio entre 0 e 1;
        float numero = rnd.nextFloat(); 
        return(numero * 10);
    } 
}
