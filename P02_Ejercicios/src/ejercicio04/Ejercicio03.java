// Modifique el programa anterior para que imprima el perímetro del cuadrado de la siguiente 
// manera:
// * * * *
// *     *
// *     *
// * * * *

package ejercicio04;
import java.util.Scanner;

public class Ejercicio03 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Ingrese el valor de un lado de un cuadrado: ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i == 1 || i == num) {
				for (int j = 1 ;j <= num; j++) {
					System.out.print("* ");
				}
			} else {
				for (int j = 1 ;j <= num; j++) {
					if (j == 1 || j == num) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}				
			System.out.println();
		}
	}
}
