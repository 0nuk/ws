// Siguiendo la misma metodología de carga, calcular la cantidad de valores >= 0 y la cantidad 
// menores que 0.
package ejercicio02;
import java.util.Scanner;

public class Ejercicio06 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int cant, cantpos = 0, cantneg = 0;
		double num;
		
		System.out.print("Introducir cantidad de números a contar > ");
		cant = scanner.nextInt();
		
		for (int i = 1; i <= cant; i++) {
			System.out.print("Introducir un número > ");
			num = scanner.nextDouble();
			if (num>=0) {
				cantpos++;
			} else {
				cantneg++;
			}
		}
		System.out.println(cantpos + " números positivos y " + cantneg + " negativos");
	}
}
