package ejercicio01;

import util.Util;

public class Ejercicio13 {
	public static void main(String[] arg) {
		int num;
		num = Util.leerInt("Ingrese un número");
		
		if (num%2 == 0) {
			Util.mostrar("Es par");
		} else {
			Util.mostrar("No es Par");
		}
	}

}
