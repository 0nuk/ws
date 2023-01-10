package ejercicio02;
import java.util.Scanner;
public class Ejercicio10 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("Ingrese número a mutiplicar > ");
		num = scanner.nextInt();
		
		for (int i = 1; i<=9; i++) {
			System.out.println(i + " * " + num + " = " + i*num);
		}
	}
}
