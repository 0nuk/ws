package ejercicio01;

import util.Util;

public class Ejercicio15 {
	public static void main(String[] arg) {
		double a, b, h;
		a = Util.leerDouble("Introduce el cateto a");
		b = Util.leerDouble("Introduce el cateto b");
		h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		Util.mostrar("Hipotenusa = " + h);
	}
}
