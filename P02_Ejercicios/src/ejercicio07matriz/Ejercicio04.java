// Desarrollar un método que reciba un array de dos dimensiones de double y retorne la suma 
// de cada fila.
package ejercicio07matriz;

public class Ejercicio04 {
	public static double[] sumaFila(double[][] matriz) {
		double[] suma = new double[matriz.length]; 
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				suma[i] += matriz[i][j];
			}		
		}
		return suma;
	}
	public static void main(String[] args) {
		double[][] matriz = new double[3][3];
		matriz[0] = new double[]{1, 2, 3};
		matriz[1] = new double[]{4, 5, 6};
		matriz[2] = new double[]{7, 8, 9}; 
		Muestra01.muestraMatriz(matriz);
		ejercicio06array.Muestra01.print(sumaFila((matriz)));
		System.out.println("---------------");
		double[][] matriz2 = new double[4][3];
		matriz2[0] = new double[]{1, 2, 3};
		matriz2[1] = new double[]{4, 5, 6};
		matriz2[2] = new double[]{7, 8, 9}; 
		matriz2[3] = new double[]{1, 2, 3}; 
		Muestra01.muestraMatriz(matriz2);
		ejercicio06array.Muestra01.print(sumaFila((matriz2)));
		System.out.println("---------------");
		double[][] matriz3 = new double[2][4];
		matriz3[0] = new double[] {1, 2, 3, 4};
		matriz3[1] = new double[] {4, 5, 6, 7}; 
		Muestra01.muestraMatriz(matriz3);
		ejercicio06array.Muestra01.print(sumaFila((matriz3)));
		System.out.println("---------------");
	}
}
