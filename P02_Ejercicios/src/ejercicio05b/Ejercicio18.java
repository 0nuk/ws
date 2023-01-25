// Método que reciba una cadena de caracteres, donde en lugar de ñ se han utilizado los 
// caracteres ny. Crear una nueva cadena de caracteres sustituyendo ny por ñ. No puedes 
// usar replace.

package ejercicio05b;

public class Ejercicio18 {
	public static void main(String[] args) {
		System.out.println(enye("todos los ninyos cumplen anyos"));
	}
	public static String enye(String cadena) {
		String cadenaMod = "";
		int pos = cadena.indexOf("ny", 0);
		for(int i = 0; i < cadena.length(); i++) {
			if (pos == i) {
				cadenaMod += "ñ";
				i ++;
				pos = cadena.indexOf("ny", pos +1);
			} else {		
				cadenaMod += cadena.charAt(i);
			}
		}
		return cadenaMod;

	}
}
