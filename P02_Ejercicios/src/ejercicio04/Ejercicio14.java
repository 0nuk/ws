// Solicite al usuario dos fechas (día1, mes1, año1, día2, mes2, año2), indicar el tiempo 
// transcurrido entre ambas, en años, meses y días sin tener en cuenta años bisiestos.
package ejercicio04;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numMes, diasMes = 0, dia, anyo, diaAcum = 0, diaResta;
		System.out.print("Ingrese el dia: ");
		dia = sc.nextInt();
		System.out.print("Ingrese el mes: ");
		numMes = sc.nextInt();
		System.out.print("Ingrese el anyo: ");
		anyo = sc.nextInt();
		
			switch(numMes) {
				case 12:
					diasMes = 30;
					diaAcum += diasMes;
				case 11:
					diasMes = 31;
					diaAcum += diasMes;		
				case 10:
					diasMes = 30;
					diaAcum += diasMes;
				case 9:
					diasMes = 31;
					diaAcum += diasMes;
				case 8:
					diasMes = 31;
					diaAcum += diasMes;
				case 7:
					diasMes = 30;
					diaAcum += diasMes;
				case 6:
					diasMes = 31;
					diaAcum += diasMes;
				case 5:
					diasMes = 30;
					diaAcum += diasMes;
				case 4:
					diasMes = 31;
					diaAcum += diasMes;
				case 3:
					diasMes = 28;
					diaAcum += diasMes;
				case 2:
					diasMes = 31;
					diaAcum += diasMes;
			}
				
		diaResta = 365 - (diaAcum + dia);
		
		if (numMes >= 1 && numMes <=12) {
			System.out.println("Faltan " + diaResta + " día/s para que acabe el año");
		} else {
			System.out.println("¡"+ dia + "/" + numMes + "/" + anyo + " es una fecha incorrecta!");
		}
	}
}
