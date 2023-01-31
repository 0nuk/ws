package ejercicio05strings;

public class Ejercicio7b {
	public static void main(String[] args) {
		System.out.println(operacion("4 / 4"));
	}
	
	public static double operacion(String oper) {
		char operador = '0';
		double result = 0;
		oper = oper.replace(" ", "");
		if(oper.indexOf('+') != -1) {
			operador = '+';
		} else if(oper.indexOf('-') != -1) {
			operador = '-';
		} else if(oper.indexOf('*') != -1) {
			operador = '*';
		} else if(oper.indexOf('/') != -1) {
			operador = '/';
		}
		
		double num1 = Double.parseDouble(oper.substring(0, oper.indexOf(operador)));
		double num2 = Double.parseDouble(oper.substring(oper.indexOf(operador)+1, oper.length()));
		
		switch(operador) {
		
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				result = num1/num2;
				break;
		}
		return result;
	}
}
