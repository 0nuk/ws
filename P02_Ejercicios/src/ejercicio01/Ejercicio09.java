package ejercicio01;

import util.Util;

public class Ejercicio09 {
	public static void main(String[] arg) {
		double c, f;
		f = Util.leerDouble("Introduce grados Fahrenheit a convertir");
		c = (5 * (f-32)) / 9;
		Util.mostrar(c+" °C");
	}
}
