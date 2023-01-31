//Elabora un método que escriba todos los caracteres de una cadena cada uno en una línea.
package ejercicio05b;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena");
		String cadena = sc.nextLine();
		
		for(int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
	}
}
