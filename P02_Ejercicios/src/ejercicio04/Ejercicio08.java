// Escriba un programa que imprima los siguientes patrones por separado, uno debajo del 
// siguiente, una vez que el usuario ingresó el tamaño, por ejemplo 5. Utilice ciclos for para 
// generar los patrones. Todos los asteriscos deberán ser impresos por un solo enunciado print
// de la forma print(‘*’). Sugerencia: los dos últimos patrones requieren que cada línea 
// comience con un número correcto de espacios en blanco: print(‘ ’).
// *     * * * * *     * * * * *     *
// * *     * * * *     * * * *     * *
// * * *     * * *     * * *     * * *
// * * * *     * *     * *     * * * *
// * * * * *     *     *     * * * * *
package ejercicio04;
import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int tri;
		System.out.print("Ingrese el tamaño del triángulo: ");
		tri = sc.nextInt();
		
		for (int i = 1; i <= tri; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= tri; i++) {
			for (int j = tri - i; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= tri; i++) {
			for (int j = tri - i; j >= 1; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= tri; i++) {
			for (int k = 1; k<i; k++) {
				System.out.print("  ");
			}
			for (int j = tri - i; j >=0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
