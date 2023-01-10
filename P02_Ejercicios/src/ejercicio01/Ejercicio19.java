package ejercicio01;

import util.Util;

public class Ejercicio19 {	
	public static void main(String[] arg) {
		int dia;
		dia = Util.leerInt("Introducir día del año");
		if (dia%7 == 1) {
			Util.mostrar("Es un lunes");
		} else if (dia%7 == 2) {
			Util.mostrar("Es un martes");
		} else if (dia%7 == 3) {
			Util.mostrar("Es un miércoles");
		} else if (dia%7 == 4) {
			Util.mostrar("Es un jueves");
		} else if (dia%7 == 5) {
			Util.mostrar("Es un viernes");
		} else if (dia%7 == 6) {
			Util.mostrar("Es un sábado");
		} else {
			Util.mostrar("Es un domingo");
		}
	}
}
