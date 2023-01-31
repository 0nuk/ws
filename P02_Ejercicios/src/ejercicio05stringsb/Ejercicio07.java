// Pedir al usuario una frase y un carácter, y decir en qué posiciones está ese carácter, o 
// indicar que no está si procede. No se puede usar indexOf o similar.
package ejercicio05stringsb;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		String posicion = "";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String frase = sc.nextLine();
		System.out.println("Ingrese un caracter: ");
		String caracterString = sc.next(); 
		
		char caracter = caracterString.charAt(0);
		for (int i = 0; i<frase.length(); i++) {
			if (frase.charAt(i) == caracter) {
				posicion += i + ", ";
			}
		}
		if(posicion.equals("")) {
			System.out.println("La frase no contiene el caracter " + caracter);
		} else {
			System.out.println("La frase contiene el caracter " + caracter + " en la posición: " + posicion);
		}
	}
}
