package aula03;

public class Circulo implements Forma {
    private double raio;
    private static final double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * (raio * raio);
    }
}
