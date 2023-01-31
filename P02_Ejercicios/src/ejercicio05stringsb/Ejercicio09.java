// Método que reciba una cadena y la transforme sustituyendo todos los espacios por * (sin 
// usar replace ni replaceAll).
package ejercicio05stringsb;
import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String frase = sc.nextLine();
		String fraseMod = "";
		for(int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				fraseMod += '*';
			} else {
				fraseMod += frase.charAt(i);
			}
		}
		System.out.println(fraseMod);
	}
}
