package tests;

import model.Circulo;
import model.Rectangulo;

public class Test01 {
	public static void main(String[] args) {
		Rectangulo r = new Rectangulo(1.5, -16.9, 8, 7);
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getL1());
		System.out.println(r.getL2());
		System.out.println(r.area());
		System.out.println(r);
	
		Circulo c = new Circulo(1.5, -16.9, 8);
		System.out.println(c.getRadio());
		System.out.println((double)Math.round(c.area()*100)/100);
		System.out.println(c);
	}
}
