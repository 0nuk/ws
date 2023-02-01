package model;

public class Circulo extends Figura{
	public double radio;
	
	public Circulo() {}
	
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public String toString() {
		return "Circ[" + x + ", " + y + "; " + radio + "]";
	}
}
