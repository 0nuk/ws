package ejercicio02;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int num, fact = 1;
		System.out.println("Números factoriales");
		System.out.print("Introducir un número > ");
		num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(num + "! = " + fact);
	}
}
