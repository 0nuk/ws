// Desarrollar un método que reciba un array de dos dimensiones de double (matriz 
// matemática) y calcule la Traza. La traza es la sumatoria de los elementos de la diagonal 
// principal de una matriz cuadrada. Nosotros la calcularemos para cualquier matriz, no sólo 
// cuadradas.
package ejercicio07matriz;

public class Ejercicio03 {
	public static double traza(double[][] matriz) {
		double acum = 0;
		for(int i=0; i<matriz[0].length && i<matriz.length; i++) {
			acum += matriz[i][i];
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
		System.out.println(traza((matriz)));
		
		double[][] matriz2 = new double[4][3];
		matriz2[0] = new double[]{1, 2, 3};
		matriz2[1] = new double[]{4, 5, 6};
		matriz2[2] = new double[]{7, 8, 9}; 
		matriz2[3] = new double[]{1, 2, 3}; 
		System.out.println();
		Muestra01.muestraMatriz(matriz2);
		System.out.println("---------------");
		System.out.println(traza((matriz2)));
		
		double[][] matriz3 = new double[2][4];
		matriz3[0] = new double[] {1, 2, 3, 4};
		matriz3[1] = new double[] {4, 5, 6, 7}; 
		System.out.println();
		Muestra01.muestraMatriz(matriz2);
		System.out.println("---------------");
		System.out.println(traza((matriz3)));
	}
}
