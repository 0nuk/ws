// Desarrollar un método que reciba, dos arrays de doubles del mismo tamaño y retorne un 
// nuevo array con la suma de los elementos que están en la misma posición.
// a. Repetir el método, pero para arrays de diferentes tamaños.
package ejercicio06array;

public class Ejercicio05 {
	public static void main(String[] args) {
		double[] nums1 = {1, 2, 3, 4, 5};
		double[] nums2 = {3, 5, 7, 4, 8, 6, 2, 3, 2, 20};
		Muestra01.print(nums1);
		Muestra01.print(nums2);
		Muestra01.print(sumaNuevo(nums2, nums1));	
	}
	public static double[] suma(double[] nums1, double[] nums2) {
		double[] valores = new double[nums1.length];
		for(int i = 0; i<valores.length; i++) {
			valores[i]=nums1[i]+nums2[i];
		}
		return valores;
	}
	public static double[] sumaNuevo(double[] nums1, double[] nums2) {
		double[] mayor, menor;
		
		if(nums1.length<nums2.length) {
			mayor = nums2;
			menor = nums1;
		} else {
			mayor = nums1;
			menor = nums2;
		}
		double[] valores = new double[mayor.length];
		for(int i = 0; i<valores.length; i++) {
			if(i<menor.length) {
				valores[i]=mayor[i]+menor[i];
			} else {
				valores[i] += mayor[i];
			}
		}
		return valores;
	}
}
