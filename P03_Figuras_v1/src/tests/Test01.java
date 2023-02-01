package tests;

import model.Figura;
import model.Rectangulo;

public class Test01 {
	public static void main(String[] args) {
		Figura f;
		f = new Figura();
		f.inicializar(15, 3.5);
		System.out.println(f.area());
		System.out.println(f.x);
		System.out.println(f.y);
		f.x = f.x + 5;
		System.out.println(f.x);
		System.out.println(f.y);
		
		Rectangulo r;
		r = new Rectangulo();
		r.inicializar(0, 0, 0, 0);
	}
}
