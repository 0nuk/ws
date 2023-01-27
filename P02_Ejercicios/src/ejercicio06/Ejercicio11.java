// Armar las estructuras necesarias para leer por pantalla los siguientes datos:
// Nombre del alumno, nota examen modulo 1, nota examen modulo 2, cantidad de 
// inasistencias. Almacenar de cada uno su nota media.
// Hacer un menú que permita las siguientes opciones:
// 1 – Agregar alumnos y con sus notas e inasistencias.
// 2 – Buscar un alumno por id (posición en el array) y mostrar toda su información.
// 3 – Buscar un alumno por nombre y mostrar toda su información.
// 4 – Listar todos los alumnos y toda su información.
// 5 – Mostrar el/los alumnos con mayor nota media.
// 6 – Mostrar los alumnos con nota media >= 5.
// 7 – Mostrar los alumnos con más de 3 inasistencias.
// 9 – Salir.
package ejercicio06;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int id=-1;
		char conti = 's';
		int opcion;
		String[] nombre = new String[10];
		double[] modulo1 = new double[10];
		double[] modulo2 = new double[10];
		double[] notamedia = new double[10];
		int[] inasistencia = new int[10];
		
		do {
			System.out.println("1 - Agregar alumnos con sus notas e inasistencias");
			System.out.println("2 – Buscar alumno por id");
			System.out.println("3 - Buscar alumno por nombre");
			System.out.println("4 – Listar todos los alumnos y toda su información");
			System.out.println("5 – Mostrar el/los alumnos con mayor nota media");
			System.out.println("6 – Mostrar los alumnos con nota media >= 5");
			System.out.println("7 – Mostrar los alumnos con más de 3 inasistencias");
			System.out.println("9 – Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			switch(opcion) {
				case 1: 
					for(int i=0; i <nombre.length && conti!='n'; i++) {
						System.out.println("Ingrese el nombre del alumno ID Nr. " + (i+1));
						nombre[i] = sc.nextLine();
						System.out.println("Ingrese la nota del módulo 1");
						modulo1[i] = sc.nextDouble();
						System.out.println("Ingrese la nota del módulo 2");
						modulo2[i] = sc.nextDouble();
						notamedia[i] = (modulo1[i]+modulo2[i])/2;
						System.out.println("Ingrese la cantidad de inasistencias");
						inasistencia[i] = sc.nextInt();
						sc.nextLine();
						System.out.println("¿Desea agregar un alumno más? s/n");
						String continuar = sc.nextLine();
						conti = continuar.charAt(0);
					}
					break;
				case 2:
					System.out.println("Ingrese el id del alumno > ");
					id = sc.nextInt()-1;
					System.out.println("|ID: "+(id+1)+"|"+" " +"|Nombre: "+nombre[id]+"	|" + " "+"|Módulo 1: "+modulo1[id]+"|" +" "+ "Módulo 2: "+modulo2[id]+"|" +" "+ "|Nota media: "+notamedia[id]+"|" +" "+ "|Inasistencias: "+inasistencia[id]+"|");
					break;
				case 3:
					System.out.println("Ingrese el nombre del alumno > ");
					String nombrea = sc.nextLine();
					for(int i = 0; i<nombre.length; i++){
						if(nombre[i].equals(nombrea)) {
							id = i;
						} else {
							id = -1;
						}
					}
					if(id!=-1) {						
						System.out.println("|ID: "+(id+1)+"|"+"|Nombre: "+nombre[id]+"|" + " "+"|Módulo 1: "+modulo1[id]+"|" +" "+ "Módulo 2: "+modulo2[id]+"|" +" "+ "|Nota media: "+notamedia[id]+"|" +" "+ "|Inasistencias : "+inasistencia[id]+"|");
					} else {
						System.out.println("¡Nombre incorrecto!");
					}
					break;
				case 4:
					for(int i=0; i<nombre.length; i++) {
						if(nombre[i]!=null) {
							System.out.println("|ID: "+(i+1)+"|"+"|Nombre: "+nombre[i]+"|" + " "+"|Módulo 1: "+modulo1[i]+"|" +" "+ "Módulo 2: "+modulo2[i]+"|" +" "+ "|Nota media: "+notamedia[i]+"|" +" "+ "|Inasistencias : "+inasistencia[i]+"|");									
						}
					}
					break;
				case 5:
					double notamayor = notamedia[0];
					for(int i=0; i<nombre.length; i++) {
						if(notamedia[i]>notamayor) {
							notamayor=notamedia[i];
						}
					}
					for(int i=0; i<nombre.length; i++) {
						if(notamedia[i]==notamayor) {
							System.out.println("|ID: "+(i+1)+"|"+"|Nombre: "+nombre[i]+"|" + " "+"|Módulo 1: "+modulo1[i]+"|" +" "+ "Módulo 2: "+modulo2[i]+"|" +" "+ "|Nota media: "+notamedia[i]+"|" +" "+ "|Inasistencias : "+inasistencia[i]+"|");																
						}
					}
					break;
				case 6:
					for(int i=0; i<nombre.length; i++) {
						if(notamedia[i]>=5) {
							System.out.println("|ID: "+(i+1)+"|"+"|Nombre: "+nombre[i]+"|" + " "+"|Módulo 1: "+modulo1[i]+"|" +" "+ "Módulo 2: "+modulo2[i]+"|" +" "+ "|Nota media: "+notamedia[i]+"|" +" "+ "|Inasistencias : "+inasistencia[i]+"|");																
						}
					}
					break;
				case 7:
					for(int i=0; i<nombre.length; i++) {
						if(inasistencia[i]>3) {
							System.out.println("|ID: "+(i+1)+"|"+"|Nombre: "+nombre[i]+"|" + " "+"|Módulo 1: "+modulo1[i]+"|" +" "+ "Módulo 2: "+modulo2[i]+"|" +" "+ "|Nota media: "+notamedia[i]+"|" +" "+ "|Inasistencias : "+inasistencia[i]+"|");																
						}
					}
					break;
				case 9:
					System.out.println("Adiós");
			}
		} while(opcion != 9);
	}
}
