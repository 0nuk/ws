// Similar al anterior pero que intercale los elementos. Ej: recibe [1, 2, 3, 4, 5] y [6, 7]; 
// retorna [1, 6, 2, 7, 3, 4, 5].

package ejercicio06;

public class Ejercicio07 {
	public static void main(String[] args) {
		int[] nums1 = {1, 1, 1, 1, 1};
		int[] nums2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		Ejercicio01.print(nums1);
		Ejercicio01.print(nums2);
		Ejercicio01.print(intercala(nums1, nums2));		
	}

	
	public static int[] intercala(int[] nums1, int[] nums2) {
		int[] valores = new int[nums1.length+nums2.length];
		int i=0; 
		int pos=0;
		while(i<nums1.length+nums2.length) {
			if(pos<nums1.length) {
				valores[i] = nums1[pos];
				i++;
			} 
			if (pos<nums2.length) {
				valores[i] = nums2[pos];
				i++;
			}
			pos++;
		}
		return valores;
	}
}
