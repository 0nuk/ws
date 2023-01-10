package ejercicio02;

import util.Util;

public class Ejercicio04 {
	public static void main(String[] arg) {
		int cant;
		double mayor, menor, num;
		cant = Util.leerInt("Ingrese la cantidad de números a comparar");
		num = Util.leerDouble("Ingrese primer número");
		mayor = num;
		menor = num;
		for (int i = 1; i < cant; i++) {
			num = Util.leerDouble("Ingrese un número");
			if (num > mayor) {
				mayor = num;
			} else if (num < menor) {
				menor = num;
			}
		}
		Util.mostrar("El mayor número es: " + mayor + ", y el menor es: " + menor);
	}
}
