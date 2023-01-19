package objetos01;

public class Coche {
	String marca;
	double velocidadActual;
	
	static int nroRuedas = 4;
	
	static int contarRuedas() {
		return nroRuedas;
	}
	
	void acelerar() {
		velocidadActual = 250;
	}
}
