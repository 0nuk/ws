// Suponiendo que el primer día del año fue lunes, escribir un programa que reciba un número 
// con el día del año (de 1 a 366) e imprima el día de la semana que le toca. Por ejemplo: si 
// recibe 3 debe imprimir ’miércoles’, si recibe 9 debe imprimir ’martes’
package ejercicio01;
import java.util.Scanner;

public class Ejercicio19 {	
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		int dia;
		System.out.println("Introducir día del año");
		dia = myscanner.nextInt();
		if (dia%7 == 1) {
			System.out.println("Es un lunes");
		} else if (dia%7 == 2) {
			System.out.println("Es un martes");
		} else if (dia%7 == 3) {
			System.out.println("Es un miércoles");
		} else if (dia%7 == 4) {
			System.out.println("Es un jueves");
		} else if (dia%7 == 5) {
			System.out.println("Es un viernes");
		} else if (dia%7 == 6) {
			System.out.println("Es un sábado");
		} else {
			System.out.println("Es un domingo");
		}
	}
}
