public class fatorial {
    public static void main(String[] args) {
    new fatorial();
    }

    public fatorial() {
        System.out.println("Fatorial de 5: " 
        + fatorialLoop(5));
        System.out.println("Fatorial de 5 Recursivo: " 
        + fatorialRecursivo(5));


    }

    public int fatorialLoop(int valor) {
        int res = valor;
        for (int i = valor -1;i > 0; i--){
            res *= i;
        }
        return res;
    }

    public int fatorialRecursivo(int n) {
        if (n < 0)return -1;
        else if (n == 0 || n == 1) return 1;
        else return(n * fatorialRecursivo(n - 1));
    }
    
}
