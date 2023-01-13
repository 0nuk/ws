// Determine si un valor entero ingresado por teclado es un palíndromo (capicúa).
package ejercicio04;
import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num1, num2, digito = 0, reverso = 0;
		System.out.print("Ingrese un número entero: ");
		num1 = sc.nextInt();
		num2 = num1;
		while (num2 != 0) {
			digito = num2%10;
			reverso = digito + (reverso*10);
			num2 = num2/10;
		}
		if (num1 == reverso) {
			System.out.print("¡Es capicúa!");
		} else {
			System.out.print("¡No es capicúa!");
		}
	}
}
