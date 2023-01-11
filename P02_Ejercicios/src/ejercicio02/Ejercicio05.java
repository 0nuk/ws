//Siguiendo la misma metodología de carga, calcular la cantidad de valores positivos
package ejercicio02;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int cant, contpos = 0;
		double num;
		
		System.out.print("Introducir la cantidad de números a comparar > ");
		cant = scanner.nextInt();
		
		for (int i = 1; i<=cant; i++) {
			System.out.print("Introduce un número > ");
			num = scanner.nextDouble();
			if (num>=0) {
				contpos++;
			}
		}
		System.out.println(contpos + " números positivos");
	}
}
