public class Retangulo extends Forma {
    private double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

    public void mostra() {
        System.out.println("Base: " 
                            + base
                            + "\nAltura: " 
                            + altura
                            +"\nÁrea: " 
                            + area() 
                            +"\nPerímetro: " 
                            + perimetro());
    }
}
