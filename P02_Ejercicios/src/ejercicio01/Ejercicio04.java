package ejercicio01;

import util.Util;

public class Ejercicio04 {
	public static void main (String arg[]) {
		double altura, base, area;
		Util.mostrar("Área de un triángulo");
		altura = Util.leerDouble("Ingrese altura del triángulo");
		base = Util.leerDouble("Ingrese base del triángulo");
		area = (altura * base)/2;
		Util.mostrar("Área: " + area);
	}
}
