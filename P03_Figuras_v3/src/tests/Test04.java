package tests;

import model.Cuadrado;
import model.Rombo;
import model.interfaces.Pintable;
import pruebas.Cliente;

public class Test04 {
	public static void main(String[] args) {
		
		Pintable p;
		p = new Rombo(1, 2, 3, 4);
		p.pintar();
	
		pintaAlgo(new Cliente());
		pintaAlgo(new Cuadrado(5, 3, 5));
	
	}
	
	public static void pintaAlgo(Pintable p) {
		p.pintar();
	}
}
