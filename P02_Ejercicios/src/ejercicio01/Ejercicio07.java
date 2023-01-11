// Dados dos números, indicar el mayor y el menor valor de los tres.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double num1, num2, mayor;
		System.out.println("Introduce el primer número");
		num1 = myscanner.nextDouble();
		System.out.println("Introduce el segundo número");
		num2 = myscanner.nextDouble();
		
		if (num1 >= num2) {
			mayor = num1;
		} else {
			mayor = num2;
			System.out.println("El mayor es: " + mayor);
		}
	}
}
