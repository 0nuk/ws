package sintaxis;

public class PruebaAsignacion {
	public static void main(String[] args) {
		int tres = 3;
		int cuatro = 4;
		int cinco = 5;
		
		cinco = cuatro = tres;
		
		System.out.println(tres);
		System.out.println(cuatro);
		System.out.println(cinco);
	}
}
