package ejercicio01;

import util.Util;

public class Ejercicio18 {
	public static void main(String[] arg) {
		double d, x1, x2, y1, y2;
		Util.mostrar("Distancia entre dos puntos");
		x1 = Util.leerDouble("Introducir coordemada x1");
		y1 = Util.leerDouble("Introducir coordemada y1");
		x2 = Util.leerDouble("Introducir coordemada x2");
		y2 = Util.leerDouble("Introducir coordemada y2");
		
		d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		Util.mostrar("Distancia: " + d);
	}
}
