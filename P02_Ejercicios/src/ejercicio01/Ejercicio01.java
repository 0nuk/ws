package ejercicio01;
import util.Util;
// El nombre canónico es: ejercicios.Ejercicio01

public class Ejercicio01 {
	public static void main(String[] arg) {
		double num, vAbs;
		
		num = Util.leerDouble("Ingrese valor numérico");
		vAbs = num;
		if(num < 0) {
			vAbs = num * (-1);
		}
		Util.mostrar("|" + num + "| = " + vAbs);
	}
}
