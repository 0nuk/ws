// Método que reciba una cadena y comprueba si el balanceo de paréntesis es correcto (se 
// abren y se cierran correctamente).
package ejercicio05b;
public class Ejercicio13 {
	public static void main(String[] args) {
		
		System.out.println(parentesis(")Holacomo estas("));
	}
	
	public static boolean parentesis(String cadena) {
		int cont = 0;
		boolean parente = true;
		
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == '(') {
				cont++;
			} else if (cadena.charAt(i) == ')') {
				cont--;
			}
		}
		if (cont != 0) {
			parente = false;
		}
		return parente;
	}
}
