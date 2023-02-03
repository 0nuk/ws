package model;

public class Circulo extends Figura{
	private double radio;
	
	public Circulo() {}
	
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double perimetro() {
		return 2*Math.PI*radio;
	}
	
	public String toString() {
		return "Circ[" + getX() + ", " + getY() + "; " + radio + "]";
	}
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Circulo otro = (Circulo)o;
		return this.radio == otro.radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
}
