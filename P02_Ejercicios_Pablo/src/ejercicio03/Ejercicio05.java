package ejercicio03;

import util.Util;

public class Ejercicio05 {
	public static void main(String[] arg) {
		
		int opcion;
		Util.mostrar("Conversor de Euros");
		double euros = 0, otraMoneda, indice = 1;
		char moneda = ' ';
		
		do {
			Util.mostrar("1 - Dolares");
			Util.mostrar("2 - Libras Esterlinas");
			Util.mostrar("3 - Yen");
			Util.mostrar("4 - Dolares Canadienses");
			Util.mostrar("0 - Salir");
			opcion = Util.leerInt(">");
			
			switch(opcion) {
				case 1:
					indice = 0.88;
					moneda = '$';
					break;
				case 2:
					indice = 1.2;
					moneda = 'L';
					break;
				case 3:
					indice = 0.0077;
					moneda = 'Y';
					break;
				case 4:
					indice = 0.71;
					moneda = 'D';
					break;
			}
			if(opcion >= 1 && opcion <= 4) {
				euros = Util.leerDouble("Importe");
				otraMoneda = euros / indice;
				Util.mostrar(euros + "€ = " + Math.round(otraMoneda*100)/100. + " " + moneda);
			}
		}while(opcion != 0);
	}
}
