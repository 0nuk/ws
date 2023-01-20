package test;

public class NumerosRomanos {
	public static void main(String[] args) {
		System.out.println(romano("XIX"));
	}
	public static int romano(String cadena) {
		int numRom = 0;	
		int numRomAnterior = 0;
		int resu = 0;
		int acumRom = 0;
		for (int i = 0; i < cadena.length(); i++) {
			switch (cadena.charAt(i)) {
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
			if(numRom==numRomAnterior) {
				resu += numRom;
				numRomAnterior = numRom; 
			} else {
				numRomAnterior = numRom;
				while(numRom == numRomAnterior) {
					acumRom += numRom;
					i++;
					switch (cadena.charAt(i)) {
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
				}
				resu += (numRom-acumRom);
			}
		}			
		return resu;
	}
}
