// Realizar un programa que adivine el número (entre 0 y 100) que ha pensado el usuario. En 
// cada paso, el programa propone un número y el usuario debe contestar, introduciendo su 
// contestación como dato, si ha acertado, o bien si el número que ha propuesto el 
// ordenador es mayor o es menor que el que tenía pensado. Por ejemplo, ingresando:
// 0 –> Acierto
// 1 –> El valor propuesto es mayor
// -1 –> El valor propuesto es Menor
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
				min = num;
				num = (max+min)/2;
			} else if (acierto == -1) {
				max = num;
				num = (max+min)/2;
			}
			System.out.println("El número en el que has pensado es: " + num + "?");
			acierto = myscanner.nextInt();
			cont++;
		}
		System.out.println("¡He adivinado en: " + cont + " intentos!");

	}
}
