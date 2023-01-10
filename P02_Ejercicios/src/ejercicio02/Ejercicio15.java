package ejercicio02;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un número > ");
		num = myscanner.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				if (i!=num)
					System.out.print(i + ", ");
				else if (i==num)
					System.out.print(i);
			}
		}
	}
}
