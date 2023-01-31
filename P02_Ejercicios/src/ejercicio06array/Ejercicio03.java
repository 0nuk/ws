// Desarrollar un método que reciba un array de enteros y retorne otro com los elementos 
// ordenados exactamente al revés que el original.
package ejercicio06array;
public class Ejercicio03 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Muestra01.print(nums);
		Muestra01.print(reves(nums));
		revesNuevo(nums);
		Muestra01.print(nums);
	}
	public static int[] reves(int[] nums) {
		int[] valores = new int[nums.length];
		for(int i=0; i<valores.length; i++) {
			valores[i] = nums[(nums.length-1)-i]; 
		}
		return valores;
	}
	public static void revesNuevo(int[] nums) {
		for(int i=0; i<nums.length/2; i++) {
			int aux = nums[i];
			nums[i] = nums[(nums.length-1)-i];			
			nums[(nums.length-1)-i] = aux;			
		}
	}
}
