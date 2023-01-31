// Desarrollar un método que reciba una cadena y un carácter e inserte el carácter entre cada 
//letra de la cadena. Ej: “separar” y ’-’ debería retornar “s-e-p-a-r-a-r”
package ejercicio05strings;

public class Ejercicio04 {
	public static void main(String[] args) {
		System.out.println(insertar("insertar", '-'));
	}
	public static String insertar(String cadena, char insert) {
		String insertada = "";
		String inserto = insert + "";
		for (int i = 0; i < cadena.length(); i++) {
			if (i != cadena.length()-1) {
				insertada += cadena.charAt(i) + inserto;
			} else {
				insertada += cadena.charAt(i);
			}
		}	
		return insertada;
	}	
}
