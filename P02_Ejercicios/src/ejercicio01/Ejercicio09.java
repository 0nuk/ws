// Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius. 
// Fórmula para la conversión: F = 9/5C + 32
package ejercicio01;
import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double c, f;
		System.out.println("Introduce grados Fahrenheit a convertir");
		f = myscanner.nextDouble();
		c = (5 * (f-32)) / 9;
		System.out.println(c+" °C");
	}
}
