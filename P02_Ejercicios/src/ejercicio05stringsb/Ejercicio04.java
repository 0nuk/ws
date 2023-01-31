// Como el anterior, pero sin importar si es mayúscula o minúscula.

package ejercicio05stringsb;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese una cadena");
	String cadena = sc.nextLine();
	cadena = cadena.trim().toUpperCase();
	if (cadena.charAt(0) == 'H') {
		System.out.println("Empieza por H");
	} else {
		System.out.println("No empieza por H");
	}
	}
}
