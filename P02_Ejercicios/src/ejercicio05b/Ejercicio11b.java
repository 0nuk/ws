// Pedir una frase y eliminar las vocales, puede usar replace o replaceAll.
package ejercicio05b;
import java.util.Scanner;

public class Ejercicio11b {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String frase = sc.nextLine();
		
		String fraseMod = frase.replaceAll("[aeiouAEIOU]", "");
		System.out.println(fraseMod);
	}
}
