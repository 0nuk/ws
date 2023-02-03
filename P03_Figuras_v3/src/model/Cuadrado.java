package model;

public class Cuadrado extends Rectangulo {
	public Cuadrado(double x, double y, double lado) {
		super(x, y, lado, lado);
	}
	public String toString() {
		return "Cuad[" + getX() + ", " + getY() + "; " + getL1() + ", " + "]";
	}
	
	public double getLado() {
		return getL1();
	}
	public void setLado(double lado) {
		setL1(lado);
		setL2(lado);
	}
	public void setL1(double l1) {
		setLado(l1);
	}
	public void setL2(double l2) {
		setLado(l2);
	}
}
