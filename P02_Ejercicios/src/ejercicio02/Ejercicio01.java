package ejercicio02;

import util.Util;

public class Ejercicio01 {
	public static void main(String[] arg) {
		int cant;
		cant = Util.leerInt("Introduzca el número hasta cual desee imprimir");
		for (int i = 1; i <= cant; i++) {
			Util.mostrar(i);
		}
	}
}
