package ejercicio01;

import util.Util;

public class Ejercicio12 {
	public static void main(String[] arg) {
		int segtotal, seg, h, min;
		seg = Util.leerInt("Ingrese los segundos del primer tiempo");
		min = Util.leerInt("Ingrese los mintos del primer timepo");
		h = Util.leerInt("Ingrese las horas del primer tiempo");
		
		segtotal = (min * 60) + (h * 3600) + seg;
		
		seg = Util.leerInt("Ingrese los segundos del segundo tiempo");
		min = Util.leerInt("Ingrese los minutos del segundo tiempo");
		h = Util.leerInt("Ingrese las horas del segundo tiempo");
		
		segtotal = segtotal + seg + (min * 60) + (h * 3600);
		
		
		h = (segtotal - (segtotal%3600)) / 3600;
		min = ((segtotal%3600)-(segtotal%3600%60)) / 60;
		seg = segtotal%3600%60;
		
		Util.mostrar("Tiempo total: " + h + ":" + min + ":" + seg);
	}
}
