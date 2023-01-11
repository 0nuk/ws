// Dado un número cualquier por teclado, mostrar su valor absoluto.
package ejercicio01;
import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double num, vAbs;
		System.out.println("Ingrese valor numérico");
		num = myscanner.nextDouble();
		vAbs = num;
		if(num < 0) {
			vAbs = num * (-1);
		}
		System.out.println("|" + num + "| = " + vAbs);
	}
}
