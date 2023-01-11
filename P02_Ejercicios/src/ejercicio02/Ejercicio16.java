// Escribir un programa que pida al usuario un número entero positivo mayor que 2 y 
// muestre por pantalla si es un número primo o no.
package ejercicio02;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int num, contDiv = 0;
		System.out.print("Ingrese un número entero mayor que 2 > ");
		num = myscanner.nextInt();
		
		for (int i = 1; i <= num && contDiv <= 2; i++) {
			if (num%i == 0) {
				contDiv++;
			}
		}
		if (contDiv <= 2) {
			System.out.println(num + " es un número primo");
		} else if (contDiv > 2) {
			System.out.println(num + " no es un número primo");
		}
		
	}
}
