package tests;

import model.Figura;

public class TestHashCode {
	public static void main(String[] args) {
		Figura f = new Figura();
		Figura e = new Figura();
		f.inicializar(5, 8);
		e.inicializar(5, 10);
		System.out.println(f);
		System.out.println(f.hashCode());
		System.out.println(e);
		System.out.println(e.hashCode());
		
		
	}
}
