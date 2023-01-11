// Escribir un programa que reciba un número n e imprima los primeros n números 
// triangulares, junto con su índice. Los números triangulares se obtienen mediante la suma 
// de los números naturales desde 1 hasta el índice n. Por ejemplo, el número triangular de 
// índice 4 es 1+2+3+4 = 10.
// Entonces, si se piden los primeros 5 números triangulares, el programa debe imprimir

package ejercicio02;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main (String[] arg) {
		
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);	
		int num, cont1 = 1, cont2 = 1, acum = 0;
		
		System.out.println("Números triangulares");
		System.out.print("Ingrese un número > ");
		num = myscanner.nextInt();
		
		while (cont1 <= num) {
			
			while (cont2 <= cont1) {
				acum += cont2;
				cont2++;
			}
			
			System.out.println(cont1 + " - " + acum);
			cont1++;
			cont2 = 1;
			acum = 0;
		}
	}
}
