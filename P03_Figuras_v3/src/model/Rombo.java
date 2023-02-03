package model;

public class Rombo extends Figura {
	private double dmayor;
	private double dmenor;
	
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
		return "Romb[" + getX() + ", " + getY() + "; " + dmayor + "; " + dmenor +"]";
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Rombo otro = (Rombo)o;
		return (this.dmayor == otro.dmayor && this.dmenor == otro.dmenor) || (this.dmayor == otro.dmenor && this.dmenor == otro.dmayor);
	}
	public double getDmayor() {
		return dmayor;
	}
	public double getDmenor() {
		return dmenor;
	}
	public void setDmayor(double dmayor) {
		this.dmayor = dmayor;
	}
	public void setDmenor(double dmenor) {
		this.dmenor = dmenor;
	}
}
