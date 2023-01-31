// Desarrollar un método que reciba una cadena e inserte un carácter cada 3 caracteres. Por 
// ejemplo: “1921680012” y ‘.’, debe retornar “192.168.001.2”
package ejercicio05strings;
public class Ejercicio05 {
	public static void main(String[] args) {
		System.out.println(insertar("hodfghdghdla", '.'));
	}
	public static String insertar(String cadena, char caracter) {
		String insertada = "";
		for (int i = 0; i < cadena.length(); i++) {
			insertada += cadena.charAt(i);
			if((i+1)%3 == 0 && cadena.length()-1 != i) {
				insertada += caracter;
			}
		}
		return insertada;
	}
}
