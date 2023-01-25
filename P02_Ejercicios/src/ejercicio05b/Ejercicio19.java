// Método que reciba una cadena y dos caracteres y reemplace en la cadena todas las 
// ocurrencias del primer carácter por el segundo. Sin utilizar replace
package ejercicio05b;
public class Ejercicio19 {
	public static void main(String[] args) {
		System.out.println(remplaso("hola como estas", 'o', '*'));
	}
	
	public static String remplaso(String cadena, char charA, char charB) {
		String cadenaMod = "";
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == charA) {
				cadenaMod += charB;
			} else {
				cadenaMod += cadena.charAt(i);
			}
		}
		return cadenaMod;
	}
}
