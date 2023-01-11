// Hacer un programa que Dado un año indicar si es bisiesto. Un año es bisiesto si es un 
// número divisible por 4, pero si es divisible por 100 debe ser es divisible por 400.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int anyo;
		System.out.println("Introduce un año");
		anyo = myscanner.nextInt();
		
		if (anyo%4 == 0 && anyo%100 != 0 || anyo%400 == 0) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}
	}
}
