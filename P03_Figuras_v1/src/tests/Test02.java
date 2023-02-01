package tests;

import model.Rectangulo;

public class Test02 {
	public static void main(String[] args) {
		Rectangulo r = new Rectangulo();
		r.inicializar(7, 9.5, 9, 9);
		System.out.println(r.area());
	}
}
