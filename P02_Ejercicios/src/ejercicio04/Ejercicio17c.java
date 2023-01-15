//	Realizar el juego “Adivina número”. El ordenador debe generar un número “secreto”
//	aleatorio con las siguientes características:
//	- Debe tener 4 dígitos diferentes
//	- No puede comenzar en 0
//	El usuario debe adivinarlo, para ello irá ingresando números de 4 cifras y el programa le
//	indicará la cantidad de dígitos correctos y la cantidad de dígitos regulares. Un dígito es
//	correcto cuando está en la posición que le corresponde y es regular si está en el número
//	secreto, pero en otra posición.
package ejercicio04;
import java.util.Scanner;

public class Ejercicio17c {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numCompu, dig1Compu, dig2Compu, dig3Compu, dig4Compu, contRegular = 0, contBueno = 0, contIntentos = 1;
// intentar con numCompu = 3302	y num = 2222	
		do {
			numCompu = 3302/*(int)(Math.random()*10000)*/;
			System.out.println(numCompu);
			dig4Compu = numCompu%10;
			numCompu = numCompu/10;
			dig3Compu = numCompu%10;
			numCompu = numCompu/10;
			dig2Compu = numCompu%10;
			numCompu = numCompu/10;
			dig1Compu = numCompu%10;
		} while (dig1Compu == 0);
		
		System.out.print("Ingrese cuatro dígitos > ");
		int num = sc.nextInt();	
		int dig4 = num%10;
		num = num/10;
		int dig3 = num%10;
		num = num/10;
		int dig2 = num%10;
		num = num/10;
		int dig1 = num%10;
		
		while (dig1 != dig1Compu || dig2 != dig2Compu || dig3 != dig3Compu || dig4 != dig4Compu) {
			
			if (dig1 == dig1Compu) {
				contBueno++;
			} else if ((dig1 == dig2Compu && dig2 != dig2Compu) || (dig1 == dig3Compu && dig3 != dig3Compu) || (dig1 == dig4Compu && dig4 != dig4Compu)) {
				contRegular++;
			}
			
			if (dig2 == dig2Compu) {
				contBueno++;
			} else if ((dig2 == dig1Compu && dig1 != dig1Compu)|| (dig2 == dig3Compu && dig3 != dig3Compu) || (dig2 == dig4Compu && dig4 != dig4Compu)) {
				contRegular++;
			}
			
			if (dig3 == dig3Compu) {
				contBueno++;
			} else if ((dig3 == dig1Compu && dig1 != dig1Compu)|| (dig3 == dig2Compu && dig2 != dig2Compu) || (dig3 == dig4Compu && dig4 != dig4Compu)) {
				contRegular++;
			}
			
			if (dig4 == dig4Compu) {
				contBueno++;				
			} else if ((dig4 == dig1Compu && dig1 != dig1Compu) || (dig4 == dig2Compu && dig2 != dig2Compu) || (dig4 == dig3Compu && dig3 != dig3Compu)) {
				contRegular++;
			}
			
			
			System.out.println(contBueno + " bueno/s y " + contRegular + " regular/es");
			
			System.out.print("Ingrese cuatro dígitos > ");
			num = sc.nextInt();	
			dig4 = num%10;
			num = num/10;
			dig3 = num%10;
			num = num/10;
			dig2 = num%10;
			num = num/10;
			dig1 = num%10;
			
			contIntentos++;
			contRegular = 0;
			contBueno = 0;
		}	
		System.out.print("Has acertado!!! en " + contIntentos + " intentos");
	}
}
