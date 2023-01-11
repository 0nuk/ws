// Hacer otro programa que ingresando los mismos datos que el anterior y calcule el Capital 
// final si no se hace ningún reintegro y la capitalización de los intereses es anual.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double ci, cf, r, t;
		System.out.println("Ganancia final");
		System.out.println("Ingrese su capital inicial");
		ci = myscanner.nextDouble();
		System.out.println("Ingrese los años a invertir");
		t = myscanner.nextDouble();
		System.out.println("Ingrese la tasa de interés anual");
		r = myscanner.nextDouble();
		cf = ci * Math.pow((1+(r/100)), t);
		System.out.println("El capital final son: " + cf);
	}
}
