// Imprimir por pantalla la suma de los n primeros números naturales, ingresando n por 
// teclado.

package ejercicio02;
import java.util.Scanner;

public class Ejercicio02B {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int cont = 1, acum = 0, cant;
		System.out.println("Cantidad de valores a procesar");
		cant = myscanner.nextInt();
		while(cont <= cant ) {
			acum +=  cont; // acum = acum + cont
			cont++; // cont = cont + 1 
		}
		System.out.println("La suma de los primeros " + cant + " naturales es " + acum);
	}
}
