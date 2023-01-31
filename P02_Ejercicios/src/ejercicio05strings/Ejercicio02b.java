package ejercicio05strings;

public class Ejercicio02b {
	public static void main(String[] args) {
	System.out.println(palindromo("Ateo por Arabia iba raro poeta"));	
	}
	
	public static boolean palindromo(String cadena) {
		String invertida = "";
		cadena = cadena.replace(" ", "").replace(".", "").toLowerCase();
		
		for(int i = cadena.length() -1; i>=0 ; i--) {
			invertida += cadena.charAt(i);
		}
		return cadena.equals(invertida);
	}	
}
