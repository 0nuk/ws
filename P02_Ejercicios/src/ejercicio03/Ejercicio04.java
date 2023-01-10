package ejercicio03;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int num, min = 0, max = 100, acierto, cont = 1;
		num = (max+min)/2;
		System.out.println("El número en el que has pensado es: " + num + "?");
		acierto = myscanner.nextInt();
		
		while (acierto != 0) {
			if (acierto == 1) {
				num = num + ((max-num)/2);
			} else if (acierto == -1) {
				num = num - ((num-min)/2);
			}
			System.out.println("El número en el que has pensado es: " + num + "?");
			acierto = myscanner.nextInt();
			cont++;
		}
		System.out.println("¡He adivinado en: " + cont + " intentos!");

	}
}
