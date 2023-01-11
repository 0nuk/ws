// Dados la base y altura de un triángulo, calcular su área.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main (String arg[]) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double altura, base, area;
		System.out.println("Área de un triángulo");
		System.out.println("Ingrese altura del triángulo");
		altura = myscanner.nextDouble();
		System.out.println("Ingrese base del triángulo");
		base = myscanner.nextDouble();
		area = (altura * base)/2;
		System.out.println("Área: " + area);
	}
}
