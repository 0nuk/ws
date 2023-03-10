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

public class Ejercicio17 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numCompu, dig1Compu, dig2Compu, dig3Compu, dig4Compu, num, contRegular = 0, contBueno = 0, contIntentos = 1, dig1, dig2, dig3, dig4;
			
		numCompu = generar();
			System.out.println(numCompu);
			dig4Compu = numCompu%10;
			numCompu = numCompu/10;
			dig3Compu = numCompu%10;
			numCompu = numCompu/10;
			dig2Compu = numCompu%10;
			numCompu = numCompu/10;
			dig1Compu = numCompu%10;
			
		do {
			System.out.print("Ingrese cuatro dígitos > ");
			num = sc.nextInt();	
			dig4 = num%10;
			num = num/10;
			dig3 = num%10;
			num = num/10;
			dig2 = num%10;
			num = num/10;
			dig1 = num%10
					;
			if (revisar(dig1, dig2, dig3, dig4) == false)
				System.out.println("No puede ingresar dígitos repetidos");
		}	while (revisar(dig1, dig2, dig3, dig4) == false);
		
		
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
			
			do {
				System.out.print("Ingrese cuatro dígitos > ");
				num = sc.nextInt();	
				dig4 = num%10;
				num = num/10;
				dig3 = num%10;
				num = num/10;
				dig2 = num%10;
				num = num/10;
				dig1 = num%10;
				if (revisar(dig1, dig2, dig3, dig4) == false)
					System.out.println("No puede ingresar dígitos repetidos ni empezar con 0.");
			}	while (revisar(dig1, dig2, dig3, dig4) == false);
			
			
			contIntentos++;
			contRegular = 0;
			contBueno = 0;
		}	
		System.out.print("Has acertado!!! en " + contIntentos + " intentos");
	}
	public static boolean revisar(int dig1, int dig2, int dig3, int dig4) {
		boolean rev = false;
		if (dig1!=dig2 && dig1!=dig3 && dig1!=dig4 && dig2!=dig3 && dig2!=dig4 && dig3!=dig4 && dig1!=0) {
			rev = true;
		} else {
			rev = false;
		}
		return rev;
	}
	
	public static int generar() {
		int num, num1, num2, num3, num4;
		do {
			num1 = ((int)(Math.random()*10));
			num2 = ((int)(Math.random()*10));
			num3 = ((int)(Math.random()*10));
			num4 = ((int)(Math.random()*10));
		} while(num1==num2 || num1==num3 || num1==num4 || num2==num3 || num2==num4 || num3==num4 || num1==0);
		num = (num1*1000) + (num2*100) + (num3*10) + num4;
		return num;
	}
	
}



