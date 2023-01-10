package ejercicio01;

import util.Util;

public class Ejercicio08 {
	public static void main(String[] arg) {
		double num1, num2, num3, mayor;
		Util.mostrar("Mayor de 3");
		num1 = Util.leerDouble();
		num2 = Util.leerDouble();
		num3 = Util.leerDouble();
		if(num1 >= num2 && num1 >= num3) {
			mayor = num1;
		} else if(num2 >= num1 && num2 >= num3) {
			mayor = num1;
		} else {
			mayor = num3;
		}
			Util.mostrar("El mayor es: " + mayor);
		}
}
