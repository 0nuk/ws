//Ingresando un número entero por teclado de 4 cifras, mostrar sus dígitos uno por línea.
package ejercicio04;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num, print;
		System.out.print("Ingrese un número entero de 4 cifras: ");
		
		num =  sc.nextInt();
		print = num/1000;
		System.out.println(print);
		num = num%1000;
		print = num/100;
		System.out.println(print);
		num = num%100;
		print = num/10;
		System.out.println(print);
		num = num%10;
		print = num;
		System.out.println(print);
	}
}
