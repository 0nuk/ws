// Haga otra versión del método, pero que reciba una cadena, un carácter y la cantidad 
// de dígitos entre las que se debe insertar el carácter.
package ejercicio05strings;

public class Ejercicio05b {
	public static void main(String[] args) {
		System.out.println(insertar("hodfghdghdla", '.', 3));
	}
	public static String insertar(String cadena, char caracter, int n) {
		String insertada = "";
		for (int i = 0; i < cadena.length(); i++) {
			insertada += cadena.charAt(i);
			
			if((i+1)%n == 0 && cadena.length()-1 != i) {
				insertada += caracter;
			}
		}
		return insertada;
	}
}
