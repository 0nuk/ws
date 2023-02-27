package excepciones.dni;

public class GeneradorDni {
	
	public static void main(String[] args) {
		int cant = 10;
		for(int i = 0; i < cant; i++) {
			System.out.println(generarNie());
		}		
	}
	
	public static String generarDni() {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		String dni = (int)(Math.random() * 100000000) + "";
		if(dni.length() < 9) {
			for(int i = dni.length(); i < 8; i++) {
				dni = "0" + dni;
			}	
		}	
		dni = dni + "-" +letras.charAt(Integer.parseInt(dni)%23);
		return dni;
	}
	public static String generarNie() {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		String nie = (int)(Math.random() * 10000000) + "";
		
		for(int i = nie.length(); i < 7; i++) {
			nie = "0" + nie;
		}	
		nie = "X" + "-" + nie + "-" +letras.charAt(Integer.parseInt(nie)%23);
		return nie;
	}
}
