// Desarrollar un programa que se ejecute de la siguiente manera:
// java … paquetes.Main usuario password
// Y verifique si el usuario existe en un array y si su password coincide con el del usuario que 
// estará cargado en otro array en la misma posición. (Ver previamente parámetros desde la 
// línea de comandos)

package ejercicio06array;

public class Ejercicio10 {
	public static void main(String[] args) {
		String[] usuario = {"Pepe", "Carlos", "Alonso", "Fernando", "Pedro"};
		String[] contrasenya = {"fhdjk", "55465", "asdfa", "jdv", "666"};
		boolean correcto = false;
		for(int i = 0; i<usuario.length; i++) {
			if(usuario[i].equals(args[0])&&contrasenya[i].equals(args[1])) {
				correcto = true;		
			}		
		}
		if(correcto==false) {
			System.out.print("Contraseña incorrecta");
		} else {
			System.out.print("Contraseña correcta");			
		}
	}
}

