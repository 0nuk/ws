// Dados tres números, indicar el mayor y el menor valor de los tres.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double num1, num2, num3, mayor;
		System.out.println("Mayor de 3");
		num1 = myscanner.nextDouble();
		num2 = myscanner.nextDouble();
		num3 = myscanner.nextDouble();
		if(num1 >= num2 && num1 >= num3) {
			mayor = num1;
		} else if(num2 >= num1 && num2 >= num3) {
			mayor = num1;
		} else {
			mayor = num3;
		}
		System.out.println("El mayor es: " + mayor);
		}
}
