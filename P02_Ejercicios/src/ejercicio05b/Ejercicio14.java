// Método que retorne cuántas palabras de menos de 3 letras tiene una frase, considerando 
// como separador de palabras únicamente el inicio de cadena, el espacio y el fin de cadena.
package ejercicio05b;

public class Ejercicio14 {
	public static void main (String[] args) {
		System.out.println(palabras("mi perro es muy bonito si si si me gusta mucho "));
	}
	public static int palabras(String cadena) {
		cadena = cadena.trim() + " "; 
		int contLetras = 0, contPalabras = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) != ' ') {
				contLetras++;
			} else {
			
				if(contLetras <= 2) {
					contPalabras++;
					contLetras = 0;
				} 
				contLetras = 0;
			}	
		}
		return contPalabras;
		
	}

}
