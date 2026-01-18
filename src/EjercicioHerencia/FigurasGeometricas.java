package EjercicioHerencia;

//atributos
public abstract class FigurasGeometricas {
 private String color;
 private int numeroLados;
 
 //constructor
 public FigurasGeometricas(String color, int numeroLados) {
     this.color = color;
     this.numeroLados = numeroLados;
 }

 //get y set
 
 public String getColor() {
     return color;
 }
 
 public void setColor(String color) {
		this.color=color;
	}
	

 public int getNumeroLados() {
     return numeroLados;
 }
 
 public void setNumeroLados(int numeroLados) {
	 this.numeroLados=numeroLados;
 }
 
 //metodos abstractos
 public abstract double obtenerArea();
 public abstract double obtenerPerimetro();

 @Override
 public String toString() {
     return "COLOR: " + color.toUpperCase() +
            "\nNÚMERO DE LADOS: " + numeroLados +
            "\nÁREA: " + obtenerArea() +
            "\nPERÍMETRO: " + obtenerPerimetro();
 }
} 
