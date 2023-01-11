// Imprimir por pantalla la suma de los n primeros números naturales, ingresando n por 
// teclado.

package ejercicio02;
import java.util.Scanner;

public class Ejercicio02C {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int acum = 0, cant;
		
		System.out.println("Cantidad de valores a procesar");
		cant = myscanner.nextInt();
		
		for(int i = 1; i <= cant; i++) {
			acum += i;
		}
		
		System.out.println("La suma de los primeros " + cant + " naturales es " + acum);
	}
}
