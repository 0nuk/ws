package metodos;

public class Metodos01 {
	public static void main(String[] arg) {
		System.out.println(pow(5,3));
		
		double resu = pow(2,4);
		
		System.out.println(resu);
		
		double hipotenusa = Math.sqrt(pow(4,2) + pow(3,2));
		System.out.println(hipotenusa);
	
		mostrar("hola que tal");
	}

	public static double pow(double base, double exp) {
		double pot = 1;
		for (int i=1; i<=exp; i++) {
			pot *= base;
		}
		return pot;
		
	}
	public static void mostrar(String mensaje) {
		System.out.println(mensaje);
	}
	
}
