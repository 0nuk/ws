package ejercicio01;

import util.Util;

public class Ejercicio11 {
	public static void main(String[] arg) {
		int seg, min, h;
		seg = Util.leerInt("Introduce segundos a convertir");
		h = (seg - (seg%3600)) / 3600;
		min = ((seg%3600)-(seg%3600%60)) / 60;
		seg = seg%3600%60;
		Util.mostrar(h + ":" + min + ":" + seg);
				
	}
}
