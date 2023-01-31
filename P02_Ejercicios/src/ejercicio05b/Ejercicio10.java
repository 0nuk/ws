// Método que reciba una cadena y un carácter y la retorne pero sólo hasta la primera
// aparición del carácter dado (sin incluirlo). No se puede utilizar indexOf.
package ejercicio05b;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		String fraseMod = "";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String frase = sc.nextLine();
		System.out.println("Ingrese un caracter: ");
		String caracterString = sc.next(); 
		char caracter = caracterString.charAt(0);
		for (int i = 0; i < frase.length() && frase.charAt(i) != caracter; i++) {
			fraseMod += frase.charAt(i); 
		}
		System.out.println(fraseMod);
	}
}
