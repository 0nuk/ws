package ejercicio01;

import util.Util;

public class Ejercicio02 {
	public static void main(String[] arg) {
		double ladoa, ladob, area, perimetro;
		
		Util.mostrar("Área y perímetro de un rectángulo");
		ladoa = Util.leerDouble("Ingrese lado a del rectángulo");
		ladob = Util.leerDouble("Ingrese lado b del rectángulo");
		
		area = ladoa * ladob;
		perimetro = (2 * ladoa) + (2 * ladob);
		Util.mostrar("Área: " + area + " Perímetro: " + perimetro);
	}
}
