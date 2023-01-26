// Desarrollar un método que reciba dos arrays de enteros y retorne un tercero con todos 
// los elementos del primero y luego los del segundo. Ej: recibe [1, 2, 3] y [4, 5]; retorna 
// [1,2,3,4,5].
package ejercicio06;
public class Ejercicio06 {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 4, 5};
		int[] nums2 = {3, 5, 7, 4, 8, 6, 2, 3, 2, 20};
		Ejercicio01.print(nums1);
		Ejercicio01.print(nums2);
		Ejercicio01.print(agranda(nums1, nums2));		
	}
	public static int[] agranda(int[] nums1, int[] nums2) {
		int[] valores = new int[nums1.length+nums2.length];
		for (int i = 0; i<nums1.length; i++) {
			valores[i] = nums1[i];
		}
		for (int i = 0; i<valores.length-nums1.length; i++) {
			valores[i+nums1.length] = nums2[i];
		}
		return valores;
	}
}
