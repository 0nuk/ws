package ejercicio01;

import util.Util;

public class Ejercicio10 {
	public static void main(String[] arg) {
		int min, h, seg;
		seg = util.Util.leerInt("Introduce segundos de un tiempo");
		min = Util.leerInt("Introduce minutos de un tiempo");
		h = Util.leerInt("Introduce horas de un tiempo");
		
		seg = seg + (min * 60) + (h * 3600);
		Util.mostrar("Son " + seg + " Segundos");
	}
}
