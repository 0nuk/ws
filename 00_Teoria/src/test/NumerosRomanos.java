package test;

public class NumerosRomanos {
	public static void main(String[] args) {
		System.out.println(romano("XCIV"));
	}
	
	public static int romano(String cadena) {
		int numRom = 0;	
		int numRomSiguiente = 0;
		int resu = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			numRom = conver(cadena.charAt(i));
			if ((i+1) < cadena.length()) {
				numRomSiguiente = conver(cadena.charAt(i+1));
				}
				if(numRom>=numRomSiguiente) {
					resu += numRom;
				} else {
					resu += ((numRomSiguiente) - numRom);
					i ++;
				}
		}
		return resu;
	}
	
	public static int conver(char roma) {
		int numRom = 0;
		switch (roma) {
		case 'I':
			numRom = 1;
			break;
		case 'V':
			numRom = 5;
			break;
		case 'X':
			numRom = 10;
			break;
		case 'L':
			numRom = 50;
			break;
		case 'C':
			numRom = 100;
			break;
		case 'D':
			numRom = 500;
			break;
		case 'M':
			numRom = 1000;
			break;	
		}
		return numRom;
	}	
}
