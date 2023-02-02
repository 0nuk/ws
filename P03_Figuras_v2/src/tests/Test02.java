package tests;

import model.Circulo;
import model.Rectangulo;

public class Test02 {
	public static void main(String[] args) {
		Rectangulo[] rectangulos = new Rectangulo[5];
		rectangulos[0] = new Rectangulo(1, 2, 3, 4);
		rectangulos[1] = new Rectangulo(5, 6, 7, 8);
		rectangulos[2] = new Rectangulo(8, 7, 5, 2);
		rectangulos[3] = new Rectangulo(0, 0, 1, 20);
		rectangulos[4] = new Rectangulo(-5, 0, 5, 3);
		
		Circulo[] circulos = {
				new Circulo(1,2,3),
				new Circulo(5,6,7),
				new Circulo(8,7,5)
		};	
		System.out.println(sumaAreas(rectangulos, circulos));
	}
	
	public static double sumaAreas(Rectangulo[] rr, Circulo[] cc) {
		double acum = 0;
		for (int i = 0; i < cc.length; i++) {
			acum += cc[i].area();
		}
		for (int i = 0; i < rr.length; i++) {
			acum += rr[i].area();
		}
		return acum;
	}
}
