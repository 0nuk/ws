// Hacer un algoritmo que, dados los catetos de un triángulo rectángulo, calcule su 
// hipotenusa.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double a, b, h;
		System.out.println("Introduce el cateto a");
		a = myscanner.nextDouble();
		System.out.println("Introduce el cateto b");
		b = myscanner.nextDouble();
		
		h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("Hipotenusa = " + h);
	}
}
