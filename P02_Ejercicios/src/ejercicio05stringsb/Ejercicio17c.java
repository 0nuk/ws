package ejercicio05stringsb;

public class Ejercicio17c {
	public static void main(String[] args) {
		System.out.println("|" + espacio("     hola como estas     ") + "|");
	}
	
	public static String espacio(String cadena) {
		while (cadena.charAt(cadena.length()-1) == ' ' || cadena.charAt(0) == ' ') {
			if (cadena.charAt(cadena.length()-1) == ' ') {
				cadena = cadena.substring(0, cadena.length()-1);
			}  
			if (cadena.charAt(0) == ' ') {
				cadena = cadena.substring(1, cadena.length());
			}
		}
		return cadena;
	}
}
