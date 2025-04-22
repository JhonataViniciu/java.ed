public class Circunferencia extends Forma {
    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    public void mostra() {
        System.out.println("Raio: " 
                          + raio
                          +"\nÁrea: " 
                          + area()
                          + "\nPerímetro: " 
                          + perimetro());
    }
}
