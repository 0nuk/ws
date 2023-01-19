package ejercicio05;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una operacón: ");
		String oper = sc.next();
		System.out.println(operacion(oper));
	}
	
	public static double operacion(String oper) {
		double result = 0;
		if (oper.indexOf('+') != -1) {
			result = Double.parseDouble(oper.substring(0, oper.indexOf('+')).trim()) + Double.parseDouble(oper.substring(oper.indexOf('+'), oper.length()).trim());
		} else if (oper.indexOf('-') != -1) {
			result = Double.parseDouble(oper.substring(0, oper.indexOf('-')).trim()) - Double.parseDouble(oper.substring(oper.indexOf('-'), oper.length()).trim());
		} else if (oper.indexOf('*') != -1) {
			result = Double.parseDouble(oper.substring(0, oper.indexOf('*')).trim()) * Double.parseDouble(oper.substring(oper.indexOf('*'), oper.length()).trim());
		}  else if (oper.indexOf('/') != -1) {
			result = Double.parseDouble(oper.substring(0, oper.indexOf('/')).trim()) / Double.parseDouble(oper.substring(oper.indexOf('/'), oper.length()).trim());
		}
		return result;
	}
}
