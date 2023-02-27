package excepciones.dni;

public class CheckDni {
	
	public static void main(String[] args) {
		
		try {
		System.out.println(checkDni("1R"));
		System.out.println(checkDni("10x"));
		System.out.println(checkDni("81411538W"));
		System.out.println(checkDni("z-0334079d"));
		System.out.println(GeneradorDni.generarDni());
		System.out.println(GeneradorDni.generarDni());
		System.out.println(GeneradorDni.generarDni());
		System.out.println(GeneradorDni.generarDni());
		System.out.println(GeneradorDni.generarDni());
		System.out.println(GeneradorDni.generarNie());
		System.out.println(GeneradorDni.generarNie());
		System.out.println(GeneradorDni.generarNie());
		System.out.println("-----------------------");
		System.out.println(checkDni("z-0334089d"));
		
		} catch(DniIncorrectoException e) {
			System.out.println("Dni incorrecto");
			e.printStackTrace();
		}
		
	}
	
	public static String checkDni(String dni) throws DniIncorrectoException {
		// Forato dni DDDDDDDD-L
		// Formato nie L-DDDDDDD-L
		boolean nie = false;
		boolean correcto =false;
		String nieLetra = "XYZ";
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		dni = dni.replaceAll(" ", "").replaceAll("-", "").toUpperCase();
		if(dni.length() < 9) {
			for(int i = dni.length(); i < 9; i++) {
				dni = "0" + dni;
			}	
		}		
		
		if(dni.length() == 9) {
			//checkaer si es un nie
			switch(dni.charAt(0)) {
			case 'X':
				dni = "0" + dni.substring(1);
				nie = true;
				break;
			case 'Y':
				dni = "1" + dni.substring(1);
				nie = true;
				break;	
			case 'Z':
				dni = "2" + dni.substring(1);
				nie = true;
				break;
			}
			try {
				int nro = Integer.parseInt(dni.substring(0, dni.length()-1));
				char letra = dni.charAt(dni.length()-1);
				correcto = letras.charAt(nro % 23) == letra;
				if(nie==true) {
					dni = nieLetra.charAt(Integer.parseInt(dni.charAt(0)+"")) + "-" + dni.substring(1, dni.length()-1) + "-" + dni.charAt(8);
				} else {
					dni = dni.substring(0, dni.length()-1) + "-" + letra;
				}
			} catch(NumberFormatException e) {
				// no cambiamos el valor de correcto. Vale false
			}
		}
		if (correcto == false) {
			throw new DniIncorrectoException();
		}
		return dni;
	}
}
