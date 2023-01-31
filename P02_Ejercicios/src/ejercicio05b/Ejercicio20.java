// Implementar las operaciones de inserción, borrado, búsqueda y copia de caracteres 
// dentro de una cadena. Sólo se permite utilizar la función Subcadena(cadena,pos,pos) para 
// una posición, no para varios caracteres.
package ejercicio05b;
public class Ejercicio20 {
	public static void main(String[] args) {
		System.out.println(insercion("Hola como estas.", "Kuno", 4));
		System.out.println(borrado("Hola Kuno como estas.", 4, 8));
		System.out.println(busqueda("Hola Kuno como estas.", "Kuno"));
	}
	
	public static String insercion(String cadena1, String cadena2, int pos) {
		String cadenaMod = cadena1.substring(0, pos) + " " +cadena2 + cadena1.substring(pos, cadena1.length());
		return cadenaMod;
	}
	
	public static String borrado(String cadena, int pos1, int pos2) {
		String cadenaMod = cadena.substring(0, pos1) + cadena.substring(pos2+1, cadena.length());
		return cadenaMod;
	}
	
	public static int busqueda(String cadena1, String cadena2) {
		int pos = -1, i = 0;
		while(pos == -1 && i < cadena1.length() - cadena2.length()) {
			if (cadena1.substring(i, i+cadena2.length()).equals(cadena2)) {
				pos = i;		
			}
			i++;
		}
		return pos;
	}
}
