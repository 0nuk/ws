// Solicite al usuario un número que represente el mes e imprima su nombre.
package ejercicio04;
import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numMes;
		String nombreMes;
		System.out.print("Ingrese un mes en formato de número: ");
		numMes = sc.nextInt();
		
		switch(numMes) {
			case 1:
				nombreMes = "Enero";
				break;
			case 2:
				nombreMes = "Febrero";
				break;
			case 3:
				nombreMes = "Marzo";
				break;
			case 4:
				nombreMes = "Abril";
				break;
			case 5:
				nombreMes = "Mayo";
				break;
			case 6:
				nombreMes = "Junio";
				break;
			case 7:
				nombreMes = "Julio";
				break;
			case 8:
				nombreMes = "Agosto";
				break;
			case 9:
				nombreMes = "Septiembre";
				break;
			case 10:
				nombreMes = "Octubre";
				break;
			case 11:
				nombreMes = "Noviembre";
				break;
			case 12:
				nombreMes = "Diciembre";
				break;
			default:
				nombreMes = "Número de mes Incorrecto";
		}
		System.out.println(nombreMes);
	}
}
