package ejercicio02;
public class Ejercicio13 {
	public static void main (String[] arg) {
		
		int lado1 = 0, lado2 = 0;
		
		while (lado1<=6) {
			while (lado2<=6) {
				System.out.println(lado1 + "|" + lado2);
				lado2 ++;
			}
			lado1++;
			lado2 = lado1;
		}
	}
}
