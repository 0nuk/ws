// Desarrollar un método que reciba un array de doubles y, en el mismo array, intercambie 
// los elementos en espejo, es decir, el primero por el último, el segundo por el penúltimo y 
// así sucesivamente
package ejercicio06array;
public class Ejercicio08 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Muestra01.print(nums);
		revesNuevo(nums);
		Muestra01.print(nums);
	}
	
	public static void revesNuevo(int[] nums) {
		for(int i=0; i<nums.length/2; i++) {
			int aux = nums[i];
			nums[i] = nums[(nums.length-1)-i];			
			nums[(nums.length-1)-i] = aux;			
		}
	}
}
