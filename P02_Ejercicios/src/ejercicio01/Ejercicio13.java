// Hacer un programa que dado un número entero n, indica si es o no par.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int num;
		System.out.println("Ingrese un número");
		num = myscanner.nextInt();
		
		if (num%2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("No es Par");
		}
	}

}
