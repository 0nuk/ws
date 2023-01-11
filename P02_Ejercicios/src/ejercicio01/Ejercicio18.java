// Escribir un programa que dados dos puntos en el plano 𝐴(𝑥1, 𝑦1) y 𝐵(𝑥2, 𝑦2), imprima la 
// distancia entre ambos.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double d, x1, x2, y1, y2;
		System.out.println("Distancia entre dos puntos");
		System.out.println("Introducir coordemada x1");
		x1 = myscanner.nextDouble();
		System.out.println("Introducir coordemada y1");
		y1 = myscanner.nextDouble();
		System.out.println("Introducir coordemada x2");
		x2 = myscanner.nextDouble();
		System.out.println("Introducir coordemada y2");
		y2 = myscanner.nextDouble();
		
		d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println("Distancia: " + d);
	}
}
