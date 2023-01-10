package ejercicio02;
public class Ejercicio11 {
	 public static void main (String[] arg) {
		 int num1 = 1, num2 = 1;
		 while (num2 <= 9) {
			 System.out.println(num1 + " * " + num2 + " = " + num1*num2);
			 num1++;
			 if (num1 == 10) {
				 num1 = 1;
				 num2++;
				 System.out.println();
			 }
		 }
	 }
}
