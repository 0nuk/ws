//Dado el radio de un círculo, calcular su perímetro y su área.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] arg) {
		
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		
		double radio, perimetro, area;
		System.out.println("Introduce el radio del círculo");
		radio = myscanner.nextDouble();
		
		perimetro = 2 * Math.PI * radio;
		
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("Perimetro: " + perimetro + " Area: " + area); 
	}
}
