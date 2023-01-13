// Ingresando un valor entero, muestre por pantalla sus dígitos en orden inverso, por ejemplo:
// INGRESO: 3589, SALIDA: 9853.
package ejercicio04;
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num1, digito = 0, reverso = 0;
		System.out.print("Ingrese un número entero: ");
		
		num1 = sc.nextInt();
		
		while (num1 != 0) {
			digito = num1%10;
			reverso = digito + (reverso*10);
			num1 = num1/10;
		}
		System.out.print(reverso);
	}
}
