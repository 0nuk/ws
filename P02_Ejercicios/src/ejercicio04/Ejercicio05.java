// Repetir el ejercicio anterior, pero ingresando un número entero de cualquier cantidad de 
// cifras.

package ejercicio04;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num, print;
		System.out.print("Ingrese un número entero: ");
		num = sc.nextInt();
		
		while (num != 0) {
			print = num%10;
			System.out.println(print);
			num = num/10;
		}
	}
}
