package ejercicio01;

import util.Util;

public class Ejercicio16 {
	public static void main(String[] arg) {
		double i, c, r, t;
		Util.mostrar("Intereses generados");
		c = Util.leerDouble("Ingrese su capital inicial");
		r = Util.leerDouble("Ingrese la tasa de interes");
		t = Util.leerDouble("Ingrese los años a invertir");
		
		i =  c * (r/100) * t;
		Util.mostrar("Intereses generados: " + i);
	}
}
