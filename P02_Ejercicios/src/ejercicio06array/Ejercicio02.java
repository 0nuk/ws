// Desarrollar un método que reciba un array de enteros y retorne otro con valores originales elevados al cuadrado

package ejercicio06array;
public class Ejercicio02 {
	public static void main(String[] args) {
	int[] nums = new int[5];
		
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		
		Muestra01.print(cuadrados(nums));
		Muestra01.print(nums);

		
	}
	public static double[] cuadrados(int[] nums) {
		double[] cuadrados = new double[nums.length];
		for(int i = 0; i < cuadrados.length; i++) {
			cuadrados[i] = Math.pow(nums[i], 2); 
		}
		return cuadrados;
	}
}
