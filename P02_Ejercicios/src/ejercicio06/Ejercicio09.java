// Desarrollar un método que reciba un array de doubles y lo ordene de menor a mayor sin 
// utilizar ninguna funcionalidad no vista en clase. (Ver previamente métodos de 
// ordenación)
package ejercicio06;
public class Ejercicio09 {
	public static void main(String[] args) {
		double[] nums = {5, 8, 18, 6, 7, 4, 0, 100, 88};
//		                {0, 8, 18, 6, 7, 4, 5, 100, 88}
//						{0, 4, 18, 6, 7, 8, 5, 100, 88}
//						{0, 4, 5, 6, 7, 8, 18, 100, 88}
		ordena(nums);
		Ejercicio01.print(nums);
	}
	public static void ordena(double[] nums) {
		double menor;
		int posicion=0;
		double aux;
		for(int i=0; i<nums.length; i++) {
			menor = nums[i];
			for(int j=i; j<nums.length; j++) {
				if(nums[j]<menor) {
					menor=nums[j];
					posicion = j;
				}
			}
			if(nums[i]!=menor) {	
				aux = nums[i];
				nums[i]=nums[posicion];
				nums[posicion] = aux;	
			}
		}
	}
}
