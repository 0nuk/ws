package ejercicio01;

import util.Util;

public class Ejercicio17 {
	public static void main(String[] arg) {
		double ci, cf, r, t;
		Util.mostrar("Ganancia final");
		ci = Util.leerDouble("Ingrese su capital inicial");
		t = Util.leerDouble("Ingrese los años a invertir");
		r = Util.leerDouble("Ingrese la tasa de interés anual");
		cf = ci * Math.pow((1+(r/100)), t);
		Util.mostrar("El capital final son: " + cf);
	}
}
