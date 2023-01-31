package ejercicio05strings;

public class Ejercicio02 {
	public static void main(String[] args) {
	System.out.println(palindromo("amadaladama"));	
	}
	
	public static boolean palindromo(String cadena) {
		String invertida = "";
		for(int i = cadena.length() -1; i>=0 ; i--) {
			invertida += cadena.charAt(i);
		}
		return cadena.equals(invertida);
	}	
}
