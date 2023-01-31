// Dada una cadena de entrada, comprobar si es una contraseña FUERTE o DÉBIL. Se 
// considera que una contraseña es fuerte si contiene 8 o más caracteres, y entre ellos al 
// menos hay una mayúscula, una minúscula, un signo de puntuación y un dígito.
// Tener en cuenta los valores decimales de los caracteres UNICODE.
package ejercicio05stringsb;

public class Ejercicio21 {
	public static void main(String[] args) {
		System.out.println(contrasenya("holAco.o2"));
	}
	
	public static String contrasenya(String contra) {
		boolean cantCaracter = false, digit = false, mayu = false, minu = false, puntua = false; 
		String devu;
		if (contra.length()>=8) {
			cantCaracter = true;
		}
		
		for (int i = 0; i < contra.length(); i++) {
			if (contra.charAt(i) <= 57 && contra.charAt(i) >= 48) digit = true;
			if (contra.charAt(i) <= 90 && contra.charAt(i) >= 65) mayu = true;
			if (contra.charAt(i) <= 122 && contra.charAt(i) >= 97) minu = true;
			if (contra.charAt(i) == 63 || contra.charAt(i) == 33 || contra.charAt(i) <= 34 && contra.charAt(i) >= 33 || contra.charAt(i) <= 41 && contra.charAt(i) >= 39 || contra.charAt(i) <= 46 && contra.charAt(i) >= 44 || contra.charAt(i) <= 59 && contra.charAt(i) >= 58 || contra.charAt(i) <= 93 && contra.charAt(i) >= 91 || contra.charAt(i) <= 125 && contra.charAt(i) >= 123) puntua = true;
		}
		
		if (cantCaracter == true && digit == true && mayu == true && minu == true && puntua == true) {
			devu = "fuerte";
		} else {
			devu = "debil";
		}
		return devu;
	}
}
