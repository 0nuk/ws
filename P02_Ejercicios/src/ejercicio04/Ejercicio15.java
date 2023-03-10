// Solicite al usuario dos fechas (día1, mes1, año1, día2, mes2, año2), indicar el tiempo 
// transcurrido entre ambas, en años, meses y días sin tener en cuenta años bisiestos.
package ejercicio04;
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int dia1, mes1, anyo1, dia2, mes2, anyo2;
		int diaMayor, mesMayor, anyoMayor, diaMayorAcum = 0, diaMenor, mesMenor, anyoMenor, diaMenorAcum = 0, diaAcum, diaResu, mesResu, anyoResu;
		
		System.out.print("Ingrese los día/s de la primera fecha: ");
		dia1 = sc.nextInt();
		System.out.print("Ingrese los mes/es de la primera fecha: ");
		mes1 = sc.nextInt();
		System.out.print("Ingrese los año/s de la primera fecha: ");
		anyo1 = sc.nextInt();
	
		System.out.print("Ingrese los día/s de la segunda fecha: ");
		dia2 = sc.nextInt();
		System.out.print("Ingrese los mes/es de la segunda fecha: ");
		mes2 = sc.nextInt();
		System.out.print("Ingrese los año/s de la segunda fecha: ");
		anyo2 = sc.nextInt();
		
		if (anyo1>anyo2 || anyo1==anyo2&&mes1>mes2 || anyo1==anyo2&&mes1==mes2&&dia1>dia2) {
			diaMayor = dia1;
			mesMayor = mes1;
			anyoMayor = anyo1;
			diaMenor = dia2;
			mesMenor = mes2;
			anyoMenor = anyo2;
		} else {
			diaMayor = dia2;
			mesMayor = mes2;
			anyoMayor = anyo2;
			diaMenor = dia1;
			mesMenor = mes1;
			anyoMenor = anyo1;
		}
		
		diaMayorAcum = acumFecha(diaMayor, mesMayor);
		diaMenorAcum = 365 - acumFecha(diaMenor, mesMenor);
		
		diaAcum = diaMenorAcum + diaMayorAcum + ((anyoMayor-anyoMenor-1)*365);
		anyoResu = diaAcum / 365;
		mesResu = (int)((diaAcum%365)/30.4166667);
		diaResu = (int)(diaAcum%365%30.4166667);
		System.out.print(diaResu + " día/s " + mesResu + " mes/es " + anyoResu + "año/s");
		
	}
	
	public static int acumFecha(int dia, int mes) {
		switch(mes) {
		case 12:
			dia += 30;
		case 11:
			dia += 31;
		case 10:
			dia += 30;
		case 9:
			dia += 31;
		case 8:
			dia += 31;
		case 7:
			dia += 30;
		case 6:
			dia += 31;
		case 5:
			dia += 30;
		case 4:
			dia += 31;
		case 3:
			dia += 28;
		case 2:
			dia += 31;
		case 1:
			dia += 0;					
	}
	return dia;
	}
}
