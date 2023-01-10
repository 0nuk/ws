package ejercicio01;

import util.Util;

public class Ejercicio07 {
	public static void main(String[] arg) {
		double num1, num2, mayor;
		num1 = Util.leerDouble("Introduce el primer número");
		num2 = Util.leerDouble("Introduce el segundo número");
		
		if (num1 >= num2) {
			mayor = num1;
		} else {
			mayor = num2;
			Util.mostrar("El mayor es: " + mayor);
		}
	}
}
