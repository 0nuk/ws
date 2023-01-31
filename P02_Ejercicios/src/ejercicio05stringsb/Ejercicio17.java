// Método que elimina los caracteres en blanco al principio de una cadena. No puedes usar 
// trim.

package ejercicio05stringsb;

public class Ejercicio17 {
	public static void main(String[] args) {
		System.out.println(espacio("          hola como estas"));
	}
	
	public static String espacio(String cadena) {
		while (cadena.charAt(0) == ' ') {
			cadena = cadena.substring(1);
		}
		return cadena;
	}
}
