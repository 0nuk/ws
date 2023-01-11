// Imprimir la suma de n números ingresados por teclado. La cantidad de números 
// (n) se solicita al usuario al principio y se ingresa por teclado.

package ejercicio02;
import java.util.Scanner;

public class Ejercicio01A {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int cant;
		double num, sum;
		sum = 0;
		System.out.print("Introduzca la cantidad de números a sumar > ");
		cant = myscanner.nextInt();
		for (int i = 1; i <= cant; i++) {
			System.out.print("Introduzca un número > ");
			num = myscanner.nextDouble();
			sum += num;
		}
		System.out.println("La suma da: " + sum);
	}
}
