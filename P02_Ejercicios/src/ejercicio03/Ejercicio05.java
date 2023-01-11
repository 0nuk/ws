// Escribir un programa que pida al usuario un número, que representará una cantidad de 
// dinero expresada en euros. A continuación, el programa le ofrecerá un menú al usuario en 
// el que le preguntará a qué divisa quiere convertir del dinero e imprimirá la conversión. Las 
// posibles divisas son las siguientes (se indica el tipo de cambio): 
// • Dólares (1 dólar = 0,88 euros) 
// • Libra Esterlina (1 Libra = 1,20 euros) 
// • Yen (1 yen = 0,0077 euros). 
// • Dólares Canadienses (1 dólar C. = 0,71 euros)
package ejercicio03;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int opcion;
		System.out.println("Conversor de Euros");
		double euros = 0, otraMoneda, indice = 1;
		char moneda = '€';
		
		do {
			System.out.println("1 - Dolares");
			System.out.println("2 - Libras Esterlinas");
			System.out.println("3 - Yen");
			System.out.println("4 - Dolares Canadienses");
			System.out.println("0 - Salir");
			opcion = myscanner.nextInt();
			

			switch(opcion) {
				case 1:
					indice = 0.88;
					moneda = '$';
					break;
				case 2:
					indice = 1.20;
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
				System.out.println("Ingrese Importe");
				euros = myscanner.nextDouble();				
				otraMoneda = euros / indice;
				System.out.println(otraMoneda + "" + moneda);		
			} 
		} while(opcion != 0);
	}
} 
