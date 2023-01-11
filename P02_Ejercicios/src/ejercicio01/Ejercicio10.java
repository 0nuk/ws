// Hacer un algoritmo que permita obtener la cantidad de segundos en un tiempo dado en 
// horas, minutos y segundos.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int min, h, seg;
		System.out.println("Introduce segundos de un tiempo");
		seg = myscanner.nextInt();
		System.out.println("Introduce minutos de un tiempo");
		min = myscanner.nextInt();
		System.out.println("Introduce horas de un tiempo");
		h = myscanner.nextInt();
		
		seg = seg + (min * 60) + (h * 3600);
		System.out.println("Son " + seg + " Segundos");
	}
}
