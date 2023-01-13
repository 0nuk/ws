// Solicite al usuario una fecha e indicar la cantidad de días transcurridos en ese año hasta esa 
// fecha.
package ejercicio04;
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numMes, diasMes = 0, dia, anyo, diaAcum = 0;
		System.out.print("Ingrese el dia: ");
		dia = sc.nextInt();
		System.out.print("Ingrese el mes: ");
		numMes = sc.nextInt();
		System.out.print("Ingrese el anyo: ");
		anyo = sc.nextInt();
		
		for (int i = 1; i<=numMes; i++) {
			switch(i) {
				case 2:
					diasMes = 28;
					break;
				case 3:
					diasMes = 31;
					break;
					
				case 4:
					diasMes = 30;
					break;
				case 5:
					diasMes = 31;
					break;
				case 6:
					diasMes = 30;
					break;
				case 7:
					diasMes = 31;
					break;
				case 8:
					diasMes = 31;
					break;
				case 9:
					diasMes = 30;
					break;
				case 10:
					diasMes = 31;
					break;
				case 11:
					diasMes = 30;
					break;
				case 12:
					diasMes = 31;
					break;
				default:
					diasMes = 0;
			}
			diaAcum += diasMes;
		}
		
		diaAcum += dia;
		
		if (numMes >= 1 && numMes <=12 /* && dia > 0 && dia <= diasMes */) {
			System.out.println("Han transcurrido " + diaAcum + " día/s");
		} else {
			System.out.println("¡"+ dia + "/" + numMes + "/" + anyo + " es una fecha incorrecta!");
		}
	}
}
