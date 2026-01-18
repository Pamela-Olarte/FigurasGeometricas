
package EjercicioHerencia;
import java.util.Scanner;

//atributos
public class Cuadrado extends FigurasGeometricas {
 private double lado;

 //constructor
 public Cuadrado(double lado, String color) {
     super(color, 4);
     this.lado = lado;
 }

 //metodos
 @Override
 public double obtenerArea() {
     return lado * lado;
 }

 @Override
 public double obtenerPerimetro() {
     return 4 * lado;
 }

 @Override
 public String toString() {
     return "CUADRADO\n" +
            "LADO: " + lado + "\n" +
            super.toString();
 }

 public static Cuadrado crearCuadrado(Scanner sc) {
     System.out.print("Introduce el tamaño del lado: ");
     double lado = Double.parseDouble(sc.nextLine());
     System.out.print("Introduce el color: ");
     String color = sc.nextLine();
     return new Cuadrado(lado, color);
 }
}