// Solicitando al usuario la cantidad de números a procesar, emitir el siguiente informe: 
// Cantidad de nos. Ingresados: xx
// Sumatoria: xxx
// Cantidad de nros positivos o 0: xx
// Cantidad de nros negativos: xx
// Cantidad de nros pares: xx
// Cantidad de nros impares: xx
// Mayor valor: xxx – ingresado en el lugar: xx
// Menor valor: xxx – ingresado en el lugar: xx
// Media: xx
package ejercicio02;
import java.util.Scanner;

public class Ejercicio09 {
	public static void main (String[] arg) {
		int cont, i = 1, cantpos = 0, cantneg = 0, cantpar = 0, cantimpar = 0, contmayor, contmenor;
		double num, sum, mayor, menor, media;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introducir cantidad de números a procesar > ");
		cont = scanner.nextInt();
		System.out.print("Introducir un número > ");
		num = scanner.nextDouble();
		sum = num;
		mayor = num;
		menor = num;
		contmayor = i;
		contmenor = i;
		
		while (i<cont) {
			i++;
			System.out.print("Introducir un número > ");
			num = scanner.nextDouble();
			sum += num;
			if (num>=0) {
				cantpos++;
			} else {
				cantneg++;
			}
			
			if (num%2 == 0) {
				cantpar++;
			} else {
				cantimpar++;
			}
			
			if (num>mayor) {
				mayor = num;
				contmayor = i;
			} else if (num<menor) {
				menor = num;
				contmenor = i;
			}
		}
		media = sum/i;
		System.out.println("Cantidad de números ingresados: " + cont);
		System.out.println("Sumatoria: " + sum);
		System.out.println("Cantidad de números positivos: " + cantpos);
		System.out.println("Cantidad de números negativos: " + cantneg);
		System.out.println("Cantidad de números pares: " + cantpar);
		System.out.println("Cantidad de números impares: " + cantimpar);
		System.out.println("Mayor valor: " + mayor + " ingresado en el lugar: " + contmayor);
		System.out.println("Menor valor: " + menor + " ingresado en el lugar: " + contmenor);
		System.out.println("Media: " + media);
	}
}
