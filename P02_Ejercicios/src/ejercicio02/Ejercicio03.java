package ejercicio02;

import util.Util;

public class Ejercicio03 {
	public static void main (String[] arg) {
		int cant;
		double num, mayor;
		cant = Util.leerInt("Ingrese la cantidad de números a comparar");
		mayor = Util.leerDouble("Ingrese primer número");
		for (int i = 1; i<cant; i++) {
			num = Util.leerDouble("Ingrese un número");
			if (num>mayor) {
				mayor = num;
			}
		}
		Util.mostrar("El mayor número es: " + mayor);
	}
}
