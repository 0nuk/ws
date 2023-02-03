package model;

public class Figura {
	public double x;
	public double y;
	
	public Figura() {}
	
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double area() {
		return 0;
	}
	
	public double perimetro() {
		return 0;
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (this.getClass() != o.getClass()) return false;
		Figura otra = (Figura)o;
		return this.x == otra.x && this.y == otra.y;
	}
}
