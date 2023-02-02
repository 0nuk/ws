package tests;

import model.Circulo;
import model.Rectangulo;

public class Test01 {
	public static void main(String[] args) {
		Rectangulo r = new Rectangulo(1.5, -16.9, 8, 7);
		System.out.println(r.x);
		System.out.println(r.y);
		System.out.println(r.l1);
		System.out.println(r.l2);
		System.out.println(r.area());
		System.out.println(r);
	
		Circulo c = new Circulo(1.5, -16.9, 8);
		System.out.println(c.radio);
		System.out.println((double)Math.round(c.area()*100)/100);
		System.out.println(c);
	}
}
