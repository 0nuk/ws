// Desarrollar un método que reciba un array de dos dimensiones de double y retorne la suma 
// total de todos los elementos.
package ejercicio07matriz;

public class Ejercicio02 {
	public static double sumaMatriz(double[][] matriz) {
		double acum = 0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				acum += matriz[i][j];
			}
		}
		return acum;
	}
	public static void main(String[] args) {
		double[][] matriz = new double[3][3];
		matriz[0] = new double[]{1, 2, 3};
		matriz[1] = new double[]{4, 5, 6};
		matriz[2] = new double[]{7, 8, 9}; 
		System.out.println();
		Muestra01.muestraMatriz(matriz);
		System.out.println("---------------");
		System.out.println(sumaMatriz((matriz)));
		
		double[][] matriz2 = new double[4][3];
		matriz2[0] = new double[]{1, 2, 3};
		matriz2[1] = new double[]{4, 5, 6};
		matriz2[2] = new double[]{7, 8, 9}; 
		matriz2[3] = new double[]{1, 2, 3}; 
		System.out.println();
		Muestra01.muestraMatriz(matriz2);
		System.out.println("---------------");
		System.out.println(sumaMatriz((matriz2)));
		
		double[][] matriz3 = new double[2][4];
		matriz3[0] = new double[] {1, 2, 3, 4};
		matriz3[1] = new double[] {4, 5, 6, 7}; 
		System.out.println();
		Muestra01.muestraMatriz(matriz2);
		System.out.println("---------------");
		System.out.println(sumaMatriz((matriz3)));
	}
}
