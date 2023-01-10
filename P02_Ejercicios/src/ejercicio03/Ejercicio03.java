package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double numAleato = Math.round(Math.random()*100);
		int num;
		System.out.print("Ingrese un número > ");
		num = myscanner.nextInt();
		while (num != numAleato) {
			System.out.println("¡No es correcto!");
			System.out.print("Ingrese otro número > ");
			num = myscanner.nextInt();
		}
		System.out.println("¡Felicitaciones, el " + num + " es correcto!");
	}
}
