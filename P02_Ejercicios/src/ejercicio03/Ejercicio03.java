// El programa generará un número aleatorio entre 0 y 100 y le pedirá al usuario que lo 
// adivine. Cuando el usuario ingrese el número para ver si acertó, el programa le indicará si 
// el número a adivinar es mayor, menor o bien si acertó. Cuando acierte, finaliza.
package ejercicio03;
import java.util.Scanner;

public class Ejercicio03 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double numAleato = Math.round(Math.random()*100);
		int num;
		System.out.print("Ingrese un número > ");
		num = myscanner.nextInt();
		while (num != numAleato) {
			System.out.println("¡No es correcto!");
			System.out.print("Ingrese otro número > ");
			num = myscanner.nextInt();
		}
		System.out.println("¡Felicitaciones, el " + num + " es correcto!");
	}
}
