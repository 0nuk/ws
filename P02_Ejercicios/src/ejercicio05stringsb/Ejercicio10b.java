// Método que reciba una cadena u un carácter y la retorne pero sólo hasta la primera
// aparición del carácter dado (sin incluirlo). No se puede utilizar indexOf.
// a. Repite el ejercicio anterior usando indexOf
package ejercicio05stringsb;
import java.util.Scanner;

public class Ejercicio10b {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String frase = sc.nextLine();
		System.out.println("Ingrese un caracter: ");
		String caracterString = sc.next(); 
		char caracter = caracterString.charAt(0);
		System.out.println(frase.substring(0, frase.indexOf(caracter)));
	}
}
