// Desarrollar un método que muestre por pantalla un array de dos dimensiones de double.
package ejercicio07matriz;

public class Muestra01 {
	public static void muestraMatriz(int[][] matriz) {
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void muestraMatriz(double[][] matriz) {
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matriz = new int[5][3];
		matriz[0] = new int[]{1, 2, 3};
		matriz[1] = new int[]{4, 5, 6};
		matriz[2] = new int[]{7, 8, 9};
		matriz[3] = new int[]{10, 11, 12};
		matriz[4] = new int[]{13, 14, 15};
		muestraMatriz(matriz);
	}
}
