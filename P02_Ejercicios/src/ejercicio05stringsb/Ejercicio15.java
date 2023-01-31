// Método que reciba dos cadenas y las junte carácter a carácter. Es decir, si recibe “pata” y 
// “coco” el resultado es “pcaotcao”. Las cadenas tienen que ser del mismo tamaño
package ejercicio05stringsb;

public class Ejercicio15 {
	public static void main(String[] args) {
		System.out.println(mezcla("pata", "coco"));
	}
	public static String mezcla(String cadena1, String cadena2) {
		String mezcla = "";
		
		for (int i = 0; i < cadena1.length(); i++) {
			mezcla += "" + cadena1.charAt(i) + cadena2.charAt(i);
		}
		return mezcla;
	}
}
