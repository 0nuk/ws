// Desarrollar un método que reciba un array de enteros y retorne otro con el doble de 
// tamaño y con los valores originales almacenados en las posiciones correspondientes.
package ejercicio06array;

public class Ejercicio04 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Muestra01.print(nums);
		Muestra01.print(doble(nums));	
	}
	public static int[] doble(int[] nums) {
		int[] valores = new int[nums.length*2];
		for(int i=0; i<nums.length; i++) {
			valores[i]=nums[i];
		}
		return valores;
	}
	public static double[] doble(double[] nums) {
		double[] valores = new double[nums.length*2];
		for(int i=0; i<nums.length; i++) {
			valores[i]=nums[i];
		}
		return valores;
	}
	public static String[] doble(String[] cadena) {
		String[] cadenaDoble = new String[cadena.length*2];
		for(int i=0; i<cadena.length; i++) {
			cadenaDoble[i]=cadena[i];
		}
		return cadenaDoble;
	}
}
