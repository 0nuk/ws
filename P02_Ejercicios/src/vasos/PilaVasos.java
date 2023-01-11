package vasos;

import java.util.Scanner;

public class PilaVasos {
	public static void main (String[] arg) {
		@SuppressWarnings("resource")
		Scanner myscanner = new Scanner(System.in);
		
		int cant, x, y = 0;
		System.out.print("Ingrese la cantidad de vasos de la base > ");
		cant = myscanner.nextInt();
		
		for(int i = 1; i <= cant; i ++) {
			x = i;
			y = i;
			
			for(int j = i; j <= cant; j++) {
					System.out.println(x + " / " + y);
					y = y + 2;
			}
		}
	}
}
