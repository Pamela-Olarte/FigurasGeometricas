package EjercicioHerencia;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color, 4);

        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return base * altura;
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "\nBase: " + base +
                "\nAltura: " + altura +
                "\nArea: " + (int) obtenerArea() +
                "\nPerimetro: " + (int) obtenerPerimetro();
    }

    public static Rectangulo crearRectangulo(Scanner sc) {
        System.out.print("Introduce la base: ");
        double base = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce la altura: ");
        double altura = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce el color: ");
        String color = sc.nextLine();

        return new Rectangulo(base, altura, color);
    }
}
