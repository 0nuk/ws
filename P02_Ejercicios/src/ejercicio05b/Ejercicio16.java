// Método que cuente el número de veces que aparece un carácter en una cadena.
package ejercicio05b;

public class Ejercicio16 {
	public static void main(String[] args) {
		System.out.println(cantidad("hola como estas", 's'));
	}
	
	public static int cantidad(String cadena, char caracter) {
		int pos = cadena.indexOf(caracter), cont = 0;
		while (pos != -1) {
			cont++;
			pos = cadena.indexOf(caracter, pos + 1);
		}
		return cont;
	}
}
