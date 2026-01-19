
package EjercicioHerencia;

import java.util.Scanner;

public class MainFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ FIGURAS GEOMÉTRICAS ---");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    Circulo circulo = Circulo.crearCirculo(sc);
                    System.out.println("\nINFORMACIÓN:");
                    System.out.println(circulo.toString());
                    break;
                case 2:
                    Cuadrado cuadrado = Cuadrado.crearCuadrado(sc);
                    System.out.println("\nINFORMACIÓN:");
                    System.out.println(cuadrado.toString());
                    break;
                case 3:
                    Triangulo triangulo = Triangulo.crearTriangulo(sc);
                    System.out.println("\nINFORMACIÓN:");
                    System.out.println(triangulo.toString());
                    break;
                case 4:
                    Rectangulo rectangulo = Rectangulo.crearRectangulo(sc);
                    System.out.println("\nINFORMACIÓN:");
                    System.out.println(rectangulo.toString());
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}