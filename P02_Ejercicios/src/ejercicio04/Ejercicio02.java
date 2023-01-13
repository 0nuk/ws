// Escriba un programa que lea el lado de un cuadrado por teclado y a continuación lo 
// muestre por pantalla en forma de asteriscos. Por ejemplo, ingresado el valor 4 la salida 
// será:
// * * * *
// * * * *
// * * * *
// * * * *
package ejercicio04;
import java.util.Scanner;

public class Ejercicio02 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Ingrese el valor de un lado de un cuadrado: ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1 ;j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
