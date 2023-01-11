// Dados un número indefinido de notas obtenidas por alumnos en sus exámenes, mostrar 
// por pantalla la mayor y la menor nota obtenida del grupo. (Cuando el usuario ingrese -1 
// finaliza la carga)
package ejercicio03;
import java.util.Scanner;

public class Ejercicio01 {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		double nota, notaMayor, notaMenor;
		System.out.print("Ingrese una nota > ");
		nota = myscanner.nextDouble();
		notaMayor = nota;
		notaMenor = nota;
		while (nota != -1) {
			if (nota > notaMayor) {
				notaMayor = nota;
			} else if (nota < notaMenor) {
				notaMenor = nota;
			}
			System.out.print("Ingrese una nota > ");
			nota = myscanner.nextDouble();
		}
		System.out.println("La mayor nota es: " + notaMayor + " y la menor: " + notaMenor);
	}
}
