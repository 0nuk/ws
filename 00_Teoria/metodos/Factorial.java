package metodos;

public class Factorial {
	
	public static void main(String[] arg) {
		
		System.out.println(factorialIt(30));
		System.out.println(factorial(30));
	}
	
	
	public static long factorialIt(long n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	} 
	
	public static long factorial(long n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
}
