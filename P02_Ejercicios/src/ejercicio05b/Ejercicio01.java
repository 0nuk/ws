//Pedir al usuario su nombre y saludarlo.
package ejercicio05b;
import java.util.Scanner;

public class Ejercicio01 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola ¿Como te llamas?");
		String nombre = sc.nextLine();
		System.out.println("Un gusto de conocerte " + nombre + ".");
	}
}
