package EjercicioHerencia;

import java.util.Scanner;

public class Triangulo extends FigurasGeometricas {

    private double lado;

    public Triangulo(double lado, String color) {
        super(color, 3);
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return lado * lado * Math.sqrt(3) / 4;
    }

    @Override
    public double obtenerPerimetro() {
        return 3 * lado;
    }

    @Override
    public String toString() {
        return "\nLado: " + lado +
                "\nArea: " + (int) obtenerArea() +
                "\nPerimetro: " + (int) obtenerPerimetro();
    }

    public static Triangulo crearTriangulo(Scanner sc) {
        System.out.print("Introduce el lado: ");
        double lado = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce el color: ");
        String color = sc.nextLine();

        return new Triangulo(lado, color);
    }

}
