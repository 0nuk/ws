// Desarrollar un método que reciba un array de enteros y retorne otro com los elementos 
// ordenados exactamente al revés que el original.
package ejercicio06;
public class Ejercicio03 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		Ejercicio01.print(nums);
		Ejercicio01.print(reves(nums));
	}
	public static int[] reves(int[] nums) {
		int[] valores = new int[nums.length];
		for(int i=0; i<valores.length; i++) {
			valores[i] = nums[(nums.length-1)-i]; 
		}
		return valores;
	}
}
