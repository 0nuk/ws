// Desarrollar dos métodos para codificar y decodificar un texto utilizando el método de 
// cifrado de César. Supondremos que el texto solo contiene letras mayúsculas o minúsculas. 
// Las letras serán las correspondientes al alfabeto inglés (26 caracteres, excluimos la ñ y Ñ).
// En este método de cifrado cada letra del texto se sustituye por otra letra que se 
// encuentra n posiciones adelante en el alfabeto, la n se recibe también como parámetro. 
// Se considera que el alfabeto es circular, es decir, la letra siguiente a la ‘z’ es la ‘a’.
// Por ejemplo, si n es 3, las transformaciones serían: 
// la ‘a’ se transformaría en ‘d’, 
// la ‘b’ en ‘e’, 
// la ‘c’ en ‘f’,
// la ‘w’ en ‘z’,
// la ‘x’ en ‘a’,
// la ‘y’ en ‘b’, etc. De la misma manera se comportarían las mayúsculas.
// Ejemplo de cifrado César: si el texto es “capaz” y n = 3 el texto cifrado es “fdsdc”.
// Para descifrar un texto se realiza la operación contraria. Se calcula la letra que está n
// posiciones por detrás en el alfabeto. Como el alfabeto es circular, la letra anterior a la ‘a’ 
// es la ‘z’.
// Trabajar con los valores decimales de los UNICODE
package ejercicio05stringsb;
public class Ejercicio23 {
	public static void main(String[] args) {
		System.out.println(codificar("hola como estas amigo mio", 3));
		System.out.println(decodificar("krod frpr hvwdv dpljr plr", 3));
	}
	
	public static String codificar(String cadena, int n) {
		String cadenaCod = "";
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)>=65 && cadena.charAt(i)<=90) {
				if (cadena.charAt(i) + n > 90) {
					cadenaCod += (char)(cadena.charAt(i)-26+n);
				} else {
					cadenaCod += (char)(cadena.charAt(i)+n);
				}
			} else if (cadena.charAt(i)>=97 && cadena.charAt(i)<=122) {
				if (cadena.charAt(i) + n > 122) {
					cadenaCod += (char)(cadena.charAt(i)-26+n);
				} else {
					cadenaCod += (char)(cadena.charAt(i)+n);
				}
			} else if (cadena.charAt(i) == ' '){
				cadenaCod += ' ';
			}
		}
		return cadenaCod;
	}
	
	public static String decodificar(String cadena, int n) {
		String cadenaCod = "";
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)>=65 && cadena.charAt(i)<=90) {
				if (cadena.charAt(i) - n < 65) {
					cadenaCod += (char)(cadena.charAt(i)+26-n);
				} else {
					cadenaCod += (char)(cadena.charAt(i)-n);
				}
			} else if (cadena.charAt(i)>=97 && cadena.charAt(i)<=122) {
				if (cadena.charAt(i) - n < 97) {
					cadenaCod += (char)(cadena.charAt(i)+26-n);
				} else {
					cadenaCod += (char)(cadena.charAt(i)-n);
				}
			} else if (cadena.charAt(i) == ' '){
				cadenaCod += ' ';
			}
		}
		return cadenaCod;
	}
}
