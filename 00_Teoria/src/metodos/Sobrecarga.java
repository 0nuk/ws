package metodos;

import util.Util;

public class Sobrecarga {
	
	
	public static int suma(int a, int b) {
		return a + b;
	}
	
	public static int suma(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double suma(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Util.mostrar(suma (5,9));
		Util.mostrar(suma (5.,9));
		Util.mostrar(suma (5,9,8));
		suma(8,3);
	}
	
	
}
