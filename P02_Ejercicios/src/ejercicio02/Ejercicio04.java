//De una lista de n números ingresados por teclado, imprimir el mayor y el menor valor.
package ejercicio02;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int cant;
		double mayor, menor, num;
		System.out.println("Ingrese la cantidad de números a comparar");
		cant = myscanner.nextInt();
		System.out.println("Ingrese primer número");
		num = myscanner.nextDouble();
		mayor = num;
		menor = num;
		for (int i = 1; i < cant; i++) {
			System.out.println("Ingrese un número");
			num = myscanner.nextDouble();
			if (num > mayor) {
				mayor = num;
			} else if (num < menor) {
				menor = num;
			}
		}
		System.out.println("El mayor número es: " + mayor + ", y el menor es: " + menor);
	}
}
