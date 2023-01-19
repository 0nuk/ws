package ejercicio05;

public class Ejercicio01 {
	public static void main(String[] args) {
		System.out.println(invertida("hola como estás"));
	}
	
	public static String invertida(String cadena) {
		String invertida = "";	
			for(int i = cadena.length() -1;i>=0; i--) {
				invertida += cadena.charAt(i);
			}
			return invertida;
	}
}
