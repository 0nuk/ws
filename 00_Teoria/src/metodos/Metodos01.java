package metodos;

import util.Util;

public class Metodos01 {

	public static void main(String[] arg) {
		mostrar(pow(5,3)+"");
		
		double resu = pow(2,4);
		
		mostrar(resu+"");
		
		double hipotenusa = Math.sqrt(pow(4,2) + pow(3,2));
		mostrar(hipotenusa+"");
		
		mostrar("hola que tal");
		
		
		double n1 = Util.leerDouble("n1");
		double n2 = Util.leerDouble("n2");
		Util.mostrar(pow(n1, n2));
	}
	
	public static double pow(double base, double exp) {
		double pot = 1;
		for (int i=1; i <= exp; i++) {
			pot *= base;
		}
		return pot;
	}
	
	public static void mostrar(String mensaje) {
		System.out.println(mensaje);
	}
	
}
