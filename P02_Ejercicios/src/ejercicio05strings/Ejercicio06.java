// Desarrolle un método llamado capitalize que ponga en mayúsculas cada palabra de una 
// frase recibida como parámetro. Por ej: si se recibe “Congreso internacional de 
// programación de String”, debe devolver, “Congreso Internacional De Programación De 
// String”. Utilice Character.toUpperCase(char c)
package ejercicio05strings;

public class Ejercicio06 {
	public static void main(String[] args) {
		System.out.println(mayuscula("hola cOmo estas a e i o "));
	}
	public static String mayuscula(String cadena) {
		cadena =  " " + cadena.trim();
		String cadenaMayus = "";
		for (int i = 0; i < cadena.length(); i++) {
			cadenaMayus += cadena.charAt(i);
			if (cadena.charAt(i) == ' ') {
				cadenaMayus += Character.toUpperCase(cadena.charAt(i+1));
				i++;
			}
		}
		return cadenaMayus.trim();
	}
}
