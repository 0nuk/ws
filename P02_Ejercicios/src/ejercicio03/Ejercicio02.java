package ejercicio03;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double num, mayorNum, menorNum, primerNum;
		int cont = 1;
		String continuar = "s";
		System.out.print("Ingrese un número > ");
		num = myscanner.nextDouble();
		mayorNum = num;
		menorNum = num;
		primerNum = num;
		System.out.print("¿Desea continuar? (s/n) ");
		continuar = myscanner.next();
		
		while (continuar.equals("s")) {
			System.out.print("Ingrese un número > ");
			num = myscanner.nextDouble();
			cont++;
			if (num>mayorNum) {
				mayorNum = num;
			} else if (num<menorNum) {
				menorNum = num;
			}
			System.out.print("¿Desea continuar? (s/n) ");
			continuar = myscanner.next();
		}
		System.out.println("Cantidad de números procesados: " + cont);
		System.out.println("Primer número: " + primerNum);
		System.out.println("Último número: " + num);
		System.out.println("Mayor número: " + mayorNum);
		System.out.println("Menor número: " + menorNum);		
	}
}
