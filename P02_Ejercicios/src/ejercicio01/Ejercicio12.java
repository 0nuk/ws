// Escribir un programa que lea de teclado dos tiempos expresados en horas, minutos y 
// segundos; las sume y muestre el resultado en horas, minutos y segundos por pantalla.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int segtotal, seg, h, min;
		System.out.println("Ingrese los segundos del primer tiempo");
		seg = myscanner.nextInt();
		System.out.println("Ingrese los mintos del primer timepo");
		min = myscanner.nextInt();
		System.out.println("Ingrese las horas del primer tiempo");
		h = myscanner.nextInt();
		
		segtotal = (min * 60) + (h * 3600) + seg;
		System.out.println("Ingrese los segundos del segundo tiempo");
		seg = myscanner.nextInt();
		System.out.println("Ingrese los minutos del segundo tiempo");
		min = myscanner.nextInt();
		System.out.println("Ingrese las horas del segundo tiempo");
		h = myscanner.nextInt();
		
		segtotal = segtotal + seg + (min * 60) + (h * 3600);
		
		
		h = (segtotal - (segtotal%3600)) / 3600;
		min = ((segtotal%3600)-(segtotal%3600%60)) / 60;
		seg = segtotal%3600%60;
		
		System.out.println("Tiempo total: " + h + ":" + min + ":" + seg);
	}
}
