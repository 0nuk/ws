package ejercicio02;
import java.util.Scanner;
public class Ejercicio12 {
	public static void main (String[] arg) {
		
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
