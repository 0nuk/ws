// Método que pida un carácter c y un número n y que devuelva una cadena con c repetido 
// n veces
package ejercicio05b;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		String c = "";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cuantas veces se devolverá c");
		int num = sc.nextInt();
		for (int i = 1; i<=num; i++) {
			c += "c";
		}
		System.out.println(c);
	}
}
