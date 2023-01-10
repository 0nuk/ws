package ejercicio02;

import util.Util;

public class Ejercicio01A {
	public static void main(String[] arg) {
		int cant;
		double num, sum;
		sum = 0;
		cant = Util.leerInt("Introduzca la cantidad de números a sumar");
		for (int i = 1; i <= cant; i++) {
			num = Util.leerDouble("Introduzca un número");
			sum += num;
		}
	Util.mostrar("La suma da: " + sum);
	}
}
