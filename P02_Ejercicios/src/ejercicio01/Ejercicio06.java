// Dados dos números reales, calcular su suma, diferencia, producto y división.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double num1, num2, suma, diferencia, producto, division;
		System.out.println("Introduce el primer número");
		num1 = myscanner.nextDouble();
		System.out.println("Introduce el segundo número");
		num2 = myscanner.nextDouble();
		suma = num1 + num2;
		diferencia = num1 - num2;
		producto = num1 * num2;
		division = num1 / num2;
		System.out.println("Suma: " + suma + " Diferencia: " + diferencia + " Producto: " + producto + " División: " + division);
	}
}
