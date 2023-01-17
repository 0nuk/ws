package metodos;

public class Metodos01 {
	public static void main(String[] arg) {
//		System.out.println(pow(5,3));
//		
//		double resu = pow(2,4);
//		
//		System.out.println(resu);
//		
//		double hipotenusa = Math.sqrt(pow(4,2) + pow(3,2));
//		System.out.println(hipotenusa);
	
		System.out.println(potencia(2, 4));
		System.out.println(fibonachi(38));	
	}

	public static double pow(double base, double exp) {
		double pot = 1;
		for (int i=1; i<=exp; i++) {
			pot *= base;
		}
		return pot;
		
	}
	public static void mostrar(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static int potencia(int n, int m) {
		if (m == 0) {
			return 1;
		} else {
			return n * potencia(n, m-1);
		}	
	}

	public static int fibonachi(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}	else {
			return fibonachi(n-1)+fibonachi(n-2);
		}
	}
}
