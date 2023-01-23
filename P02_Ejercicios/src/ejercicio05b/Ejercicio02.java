// Programa que diga si una cadena dada por el usuario está o no vacía.
package ejercicio05b;
import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena ");
		String cadena = sc.nextLine();
		if (cadena.equals("")) {
			System.out.println("Esta vacía");
		} else {
			System.out.println("No esta vacía");			
		}
	}
}
