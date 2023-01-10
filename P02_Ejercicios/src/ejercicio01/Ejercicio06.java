package ejercicio01;

import util.Util;

public class Ejercicio06 {
	public static void main(String[] arg) {
		double num1, num2, suma, diferencia, producto, division;
		num1 = Util.leerDouble("Introduce el primer número");
		num2 = Util.leerDouble("Introduce el segundo número");
		suma = num1 + num2;
		diferencia = num1 - num2;
		producto = num1 * num2;
		division = num1 / num2;
		Util.mostrar("Suma: " + suma + " Diferencia: " + diferencia + " Producto: " + producto + " División: " + division);
	}
}
