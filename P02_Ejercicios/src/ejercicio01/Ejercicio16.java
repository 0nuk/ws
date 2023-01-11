// Escribir un programa que le pregunte al usuario una cantidad de euros a invertir o capital 
// inicial (Ci), una tasa de interés anual (R) y un número de años (T) y muestre como resultado 
// el monto final a obtener. Como se irán retirando los intereses generados por año, se debe 
// calcular con la fórmula de interés simple. 
package ejercicio01;
import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double i, c, r, t;
		System.out.println("Intereses generados");
		System.out.println("Ingrese su capital inicial");
		c = myscanner.nextDouble();
		System.out.println("Ingrese la tasa de interes");
		r = myscanner.nextDouble();
		System.out.println("Ingrese los años a invertir");
		t = myscanner.nextDouble();
		
		i =  c * (r/100) * t;
		System.out.println("Intereses generados: " + i);
	}
}
