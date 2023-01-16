// Repetir el ejercicio anterior, pero ingresando un número entero de cualquier cantidad de 
// cifras.

package ejercicio04;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num, print, cont = 0, cant;
		System.out.print("Ingrese un número entero: ");
		num = sc.nextInt();
		cant = num;
		
		while (cant != 0) {
			 cant = cant/10;
			 cont++;
		}
		
		while (num != 0) {
			cont--;
			print = num/(int)Math.pow(10, cont);
			System.out.println(print); 
			num = num%(int)Math.pow(10, cont);
		}
	}
}
