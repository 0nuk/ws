// Solicite al usuario un número que represente el mes e imprima su nombre y la cantidad de 
// días que tiene (no contemplar años bisiestos)
package ejercicio04;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numMes, dias;
		String nombreMes;
		System.out.print("Ingrese un mes en formato de número: ");
		numMes = sc.nextInt();
		
		switch(numMes) {
			case 1:
				nombreMes = "Enero";
				dias = 31;
				break;
			case 2:
				nombreMes = "Febrero";
				dias = 28;
				break;
			case 3:
				nombreMes = "Marzo";
				dias = 31;
				break;
				
			case 4:
				nombreMes = "Abril";
				dias = 30;
				break;
			case 5:
				nombreMes = "Mayo";
				dias = 31;
				break;
			case 6:
				nombreMes = "Junio";
				dias = 30;
				break;
			case 7:
				nombreMes = "Julio";
				dias = 31;
				break;
			case 8:
				nombreMes = "Agosto";
				dias = 31;
				break;
			case 9:
				nombreMes = "Septiembre";
				dias = 30;
				break;
			case 10:
				nombreMes = "Octubre";
				dias = 31;
				break;
			case 11:
				nombreMes = "Noviembre";
				dias = 30;
				break;
			case 12:
				nombreMes = "Diciembre";
				dias = 31;
				break;
			default:
				nombreMes = "Número de mes Incorrecto";
				dias = 0;
		}
		if (numMes >= 1 && numMes <=12) {
			System.out.println(nombreMes + " tiene " + dias +" días");
		} else {
			dias = 31;
			System.out.println(nombreMes);
		}
	}
}
