package ejercicio05;

public class Ejercicio03 {
	public static void main(String[] arg) {
	System.out.println(sigla("Universal serial bus"));
	}
	public static String sigla(String cadena) {
		
		String sig = cadena.toUpperCase().charAt(0) + "";
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == (' ')) {
				sig += cadena.toUpperCase().charAt(i+1);
			}
		}
		return sig;
	}
}
