package ejercicio02;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int num;
		System.out.println("Ingrese un número");
		num = myscanner.nextInt();
		
		
		while (num>=0) {
			if (num!=0) {
				System.out.print(num+  ", ");
			} else if (num == 0){
				System.out.print(num);
			}
			num--;
		}
		
	}
}
