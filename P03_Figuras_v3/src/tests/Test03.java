package tests;
import model.*;

public class Test03 {
	public static void main(String[] args) {

//	Figura[] f = {
//		new Rectangulo(1, 2, 3, 4),
//		new Rectangulo(5, 6, 7, 8),
//		new Rectangulo(8, 7, 5, 2),
//		new Rectangulo(0, 0, 1, 20),
//		new Rectangulo(-5, 0, 5, 3),
//		new Circulo(1,2,3),
//		new Circulo(5,6,7),
//		new Circulo(8,7,5),
//		new Rombo(1, 2, 3, 2),
//		new Rombo(1, 2, 2, 9),
//		new Rombo(1, 2, 1, 8),
//		new Rombo(1, 2, 6, 8)
//		};
//	System.out.println((double)Math.round(sumaAreas(f)*100)/100);
//	System.out.println((double)Math.round(sumaPerimetro(f)*100)/100);
//	System.out.println(f[11].perimetro());
		Cuadrado cu = new Cuadrado(1, 2, 5);
		System.out.println(cu.area());
		System.out.println(cu.perimetro());
		System.out.println(cu);
	}
	public static double sumaAreas(Figura[] ff) {
		double acum = 0;
		for (int i = 0; i < ff.length; i++) {
			acum += ff[i].area();
		}
		return acum;
	}
	public static double sumaPerimetro(Figura[] ff) {
		double acum = 0;
		for (int i = 0; i < ff.length; i++) {
			acum += ff[i].perimetro();
		}
		return acum;
	}
}
