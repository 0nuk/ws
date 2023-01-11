// De una lista de n números ingresados por teclado, imprimir el mayor.
package ejercicio02;
import java.util.Scanner;

public class Ejercicio03 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int cant;
		double num, mayor;
		System.out.println("Ingrese la cantidad de números a comparar");
		cant = myscanner.nextInt();
		System.out.println("Ingrese primer número");
		mayor = myscanner.nextDouble();
		for (int i = 1; i<cant; i++) {
			System.out.println("Ingrese un número");
			num = myscanner.nextDouble();
			if (num>mayor) {
				mayor = num;
			}
		}
		System.out.println("El mayor número es: " + mayor);
	}
}
