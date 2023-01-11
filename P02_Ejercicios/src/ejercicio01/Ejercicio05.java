// Dado el radio de una esfera, calcular su volumen.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double radio, volumen;
		System.out.println("Esfera");
		System.out.println("Ingrese radio");
		radio = myscanner.nextDouble();
		volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
		System.out.println("El volumen es: " + volumen);
	}
}
