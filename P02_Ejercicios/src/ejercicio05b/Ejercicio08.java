// Método que reciba una cadena y retorne el número de vocales que contiene.
package ejercicio05b;
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String frase = sc.nextLine();
		frase = frase.toLowerCase();
		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
				cont++;
			}
		}
		
		System.out.println("La frase contiene " + cont + " vocales");
	}
}
