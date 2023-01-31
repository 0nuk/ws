// Repite el ejercicio anterior, pero usando indexOf
package ejercicio05stringsb;

import java.util.Scanner;

public class Ejercicio07b {
	public static void main (String[] args) {
		String posicion = "";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String frase = sc.nextLine();
		System.out.println("Ingrese un caracter: ");
		String caracterString = sc.next(); 
		char caracter = caracterString.charAt(0);
		int pos = frase.indexOf(caracter);
		
		while (pos != -1) {
			posicion += pos + ", ";
			pos = frase.indexOf(caracter, pos + 1);
		}
		
		
		if(posicion.equals("")) {
			System.out.println("La frase no contiene el caracter " + caracter);
		} else {
			System.out.println("La frase contiene el caracter " + caracter + " en la posición: " + posicion);
		}
	}
}
