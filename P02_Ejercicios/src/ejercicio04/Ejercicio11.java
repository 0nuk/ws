// Solicitar una fecha (día, mes, año) y validar si es una fecha correcta sin contemplar años 
// bisiestos, es decir, no se puede ingresar 29 2 xxxx.
package ejercicio04;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numMes, diasMes, dia, anyo;
		System.out.print("Ingrese el dia: ");
		dia = sc.nextInt();
		System.out.print("Ingrese el mes: ");
		numMes = sc.nextInt();
		System.out.print("Ingrese el anyo: ");
		anyo = sc.nextInt();
		
		switch(numMes) {
			case 1:
				diasMes = 31;
				break;
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
		if (numMes >= 1 && numMes <=12 && dia > 0 && dia <= diasMes) {
			System.out.println("¡"+ dia + "/" + numMes + "/" + anyo + " es una fecha correcta!");
		} else {
			System.out.println("¡"+ dia + "/" + numMes + "/" + anyo + " es una fecha incorrecta!");
		}
	}
}
