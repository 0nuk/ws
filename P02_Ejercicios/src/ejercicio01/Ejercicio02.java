// Dados los lados de un rectángulo, calcular su perímetro y su área.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double ladoa, ladob, area, perimetro;
		System.out.println("Área y perímetro de un rectángulo");
		System.out.print("Ingrese lado a del rectángulo");
		ladoa = myscanner.nextDouble();
		System.out.println("Ingrese lado b del rectángulo");
		ladob = myscanner.nextDouble();
		area = ladoa * ladob;
		perimetro = (2 * ladoa) + (2 * ladob);
		System.out.println("Área: " + area + " Perímetro: " + perimetro);
	}
}
