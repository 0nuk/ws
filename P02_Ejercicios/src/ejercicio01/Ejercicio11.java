// Hacer un algoritmo que permita Obtener la cantidad de horas, minutos y segundos de un 
// tiempo dado en segundos.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int seg, min, h;
		System.out.println("Introduce segundos a convertir");
		seg = myscanner.nextInt();
		h = (seg - (seg%3600)) / 3600;
		min = ((seg%3600)-(seg%3600%60)) / 60;
		seg = seg%3600%60;
		System.out.println(h + ":" + min + ":" + seg);
				
	}
}
