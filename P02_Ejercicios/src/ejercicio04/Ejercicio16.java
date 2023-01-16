// Escriba un programa que nos calcule el cambio que debe dar la caja de un supermercado:
// Dado un precio y una cantidad de dinero, el programa nos dirá cuántas monedas deben
// darse como cambio de tal forma que el número total de monedas sea mínimo.
package ejercicio04;
import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int cuenta, pago, moneda1, moneda2, moneda5, moneda10, moneda20, moneda50;
		int moneda100, moneda200, billete5, billete10, billete20;
		int billete50, billete100, billete200, total;
		
		System.out.print("Ingrese el precio en € > ");
		cuenta = (int)(sc.nextDouble()*100);
		System.out.print("Ingrese la cantidad de dinero en € > ");
		pago = (int)(sc.nextDouble()*100);
		total = pago - cuenta;
		
		billete200 = total/20000;
		total = total%20000;
		billete100 = total/10000;
		total = total%10000;
		billete50 = total/5000;
		total = total%5000;
		billete20 = total/2000;
		total = total%2000;
		billete10 = total/1000;
		total = total%1000;
		billete5 = 	total/500;
		total = total%500;
		moneda200 = total/200;
		total = total%200;
		moneda100 = total/100;
		total = total%100;
		moneda50 = 	total/50;
		total = total%50;
		moneda20 = 	total/20;
		total = total%20;
		moneda10 = 	total/10;
		total = total%10;
		moneda5 = 	total/5;
		total = total%5;
		moneda2 = total/2;
		total = total%2;
		moneda1 = total;
										
		if (billete200!=0)
			System.out.println("200€: " + billete200);
		if (billete100!=0)
			System.out.println("100€: " + billete100);
		if (billete50!=0)
			System.out.println("50€: " + billete50);
		if (billete20!=0)
			System.out.println("20€: " + billete20);
		if (billete10!=0)
			System.out.println("10€: " + billete10);
		if (billete5!=0)
			System.out.println("5€: " + billete5);
		if (moneda200!=0)
			System.out.println("2€: " + moneda200);
		if (moneda100!=0)						
			System.out.println("1€: " + moneda100);
		if (moneda50!=0)
			System.out.println("0.50€: " + moneda50);
		if (moneda20!=0)
			System.out.println("0.20€: " + moneda20);
		if (moneda10!=0)
			System.out.println("0.10€: " + moneda10);
		if (moneda5!=0)
			System.out.println("0.05€: " + moneda5);
		if (moneda2!=0)
			System.out.println("0.02€: " + moneda2);
		if (moneda1!=0)
			System.out.println("0.01€: " + moneda1);
	}
}
