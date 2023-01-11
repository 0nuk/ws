// Imprimir por pantalla los números 1 hasta un número ingresado por teclado.

package ejercicio02;
import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int cant;
		System.out.println("Introduzca el número hasta cual desee imprimir");
		cant = myscanner.nextInt();
		for (int i = 1; i <= cant; i++) {
			System.out.println(i);
		}
	}
}
