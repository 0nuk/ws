package metodos;

import util.Util;

public class Parametros {
	
	public static void main(String[] args) {
		int num1=10, num2=20;
		pedirNumeros(num1, num2);
		
		Util.mostrar(num1);
		Util.mostrar(num2);
	}
	
	public static void pedirNumeros(int a, int b) {
		Util.mostrar(a);
		Util.mostrar(b);
		a = 99;
		b = 99;
		Util.mostrar(a);
		Util.mostrar(b);
	}
}
