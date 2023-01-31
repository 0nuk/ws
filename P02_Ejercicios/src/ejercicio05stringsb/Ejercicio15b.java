// Mejorar el anterior para que no importe que las palabras sean de distinto tamaño. Es 
// decir, si recibe “patata” y “coco” el resultado sería “pcaotcaota”, añadiendo la 
// cadena sobrante directamente al final.
package ejercicio05stringsb;

public class Ejercicio15b {
	public static void main(String[] args) {
	System.out.println(mezcla("patata", "coco"));	
	}
	public static String mezcla(String cadena1, String cadena2) {
		String larga, corta, mezcla = "";
		int i = 0;
		if (cadena1.length()<cadena2.length()) {
			larga = cadena2;
			corta = cadena1;
		} else {
			larga = cadena1;
			corta =cadena2;
		}
		for (; i < corta.length(); i++) {
			mezcla += "" + larga.charAt(i) + corta.charAt(i);
		}
		mezcla = mezcla + larga.substring(i, larga.length());
		return mezcla;
	}
}
