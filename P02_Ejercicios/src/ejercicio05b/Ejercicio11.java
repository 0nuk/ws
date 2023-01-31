// Pedir una frase y eliminar las vocales. No se puede usar replace ni replaceAll.
package ejercicio05b;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		String fraseMod = "";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String frase = sc.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != 'a' && frase.charAt(i) != 'e' && frase.charAt(i) != 'i' && frase.charAt(i) != 'o' && frase.charAt(i) != 'u') {
				fraseMod += frase.charAt(i);
			}
		}
		System.out.println(fraseMod);
	}
}
