package ejercicio01;

import util.Util;

public class Ejercicio14 {
	public static void main(String[] arg) {
		int anyo;
		anyo = Util.leerInt("Introduce un año");
		
		if (anyo%4 == 0 && anyo%100 != 0 || anyo%400 == 0) {
			Util.mostrar("Es bisiesto");
		} else {
			Util.mostrar("No es bisiesto");
		}
	}
}
