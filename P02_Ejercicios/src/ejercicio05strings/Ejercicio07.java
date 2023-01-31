package ejercicio05strings;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una operacón: ");
		String oper = sc.nextLine();
		System.out.println(operacion(oper));
	}
	
	public static double operacion(String oper) {
		double result = 0;
		oper = oper.replaceAll(" ", "");
			
		if (oper.indexOf('+') != -1) {
			result = Double.parseDouble(oper.substring(0, oper.indexOf('+'))) + Double.parseDouble(oper.substring(oper.indexOf('+')+1, oper.length()));
		} else if (oper.indexOf('-') != -1) {
			result = Double.parseDouble(oper.substring(0, oper.indexOf('-'))) - Double.parseDouble(oper.substring(oper.indexOf('-')+1, oper.length()));
		} else if (oper.indexOf('*') != -1) {
			result = Double.parseDouble(oper.substring(0, oper.indexOf('*'))) * Double.parseDouble(oper.substring(oper.indexOf('*')+1, oper.length()));
		}  else if (oper.indexOf('/') != -1) {
			result = Double.parseDouble(oper.substring(0, oper.indexOf('/'))) / Double.parseDouble(oper.substring(oper.indexOf('/')+1, oper.length()));
		}
		return result;
	}
}
