// Calculadora de 4 operaciones. El usuario ingresa dos números y un carácter (+, -, *, / ) y el 
// programa debe mostrar la operación y su resultado.
// Por ejemplo:
// Ingrese valor: 12.5
// Ingrese valor: 2
// Ingrese operación: -
// 12.5 – 2 = 10.5

package ejercicio04;
import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String oper;
		double num1, num2, resu = 0;
		System.out.print("Ingrese valor: ");
		num1 = sc.nextDouble();
		System.out.print("Ingrese valor: ");
		num2 = sc.nextDouble();
		System.out.print("Ingrese operación: ");
		oper = sc.next();
		
		switch(oper) {
			case "+":
				resu = num1 + num2;
				break;
				
			case "-":
				resu = num1 - num2;
				break;
				
			case "*":
				resu = num1 * num2;
				break;
				
			case "/":
				resu = num1 / num2;
				break;
				
			default:
				resu = 0;
		}
		if (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
			System.out.println(num1 + " " + oper + " " + num2 + " = " + resu);	
		} else {
			System.out.println("Operados incorrecto");
		}
	}
}
