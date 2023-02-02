package model;

public class Rombo extends Figura {
	public double dmayor;
	public double dmenor;
	
	public Rombo(double x, double y, double dmayor, double dmenor){
		super(x, y);
		this.dmayor = dmayor;
		this.dmenor = dmenor;
	}
	public double area() {
		return (dmayor*dmenor)/2;
	}
	
	public double perimetro() {
		return 4*Math.sqrt(Math.pow(dmayor/2, 2)+Math.pow(dmenor/2, 2));
	}
	
	public String toString() {
		return "Romb[" + x + ", " + y + "; " + dmayor + "; " + dmenor +"]";
	}
}
