package ejercicio01;

import util.Util;

public class Ejercicio03 {
	public static void main(String[] arg) {
		double radio, perimetro, area;
		
		radio = Util.leerDouble("Introduce el radio del círculo");
		
		perimetro = 2 * Math.PI * radio;
		
		area = Math.PI * Math.pow(radio, 2);
		
		Util.mostrar("Perimetro: " + perimetro + " Area: " + area); 
	}
}
