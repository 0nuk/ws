// Método que sustituya mayúsculas por minúsculas y minúsculas por mayúsculas en una 
// frase. Utilizar Character.toUpperCase(char c) y Character.toLowerCase(char c).
package ejercicio05stringsb;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		System.out.println(mayuminu(frase));
	}
	public static String mayuminu(String cadena) {
		String fraseMod = "";
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == Character.toUpperCase(cadena.charAt(i))) {
				fraseMod += Character.toLowerCase(cadena.charAt(i));
					} else if (cadena.charAt(i) == Character.toLowerCase(cadena.charAt(i))) {
						fraseMod += Character.toUpperCase(cadena.charAt(i));
					}
		}
		return fraseMod;
	}
}
