package ejercicio02;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		System.out.println("Números pares");
		System.out.print("Introducir el número menor > ");
		num1 = scanner.nextInt();
		System.out.print("Introducir el número mayor > ");
		num2 = scanner.nextInt();
		if (num1%2 != 0) {
			num1 = num1 +1;
		} else {
			num1 = num1 +2;
		}
			
		while (num1 < num2) {
			System.out.print(num1 + ", ");
			num1 = num1 + 2;
		}
	}
}
