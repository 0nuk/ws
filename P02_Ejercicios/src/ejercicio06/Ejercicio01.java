//Desarrolar un método que muestre un array de Doubles por pantalla
package ejercicio06;

public class Ejercicio01 {
	public static void main(String[] args) {
		double[] nums = new double[5];
		
		nums[0] = 1.1;
		nums[1] = 1.2;
		nums[2] = 1.3;
		nums[3] = 1.4;
		nums[4] = 1.5;
		
		print(nums);
	}
	
	public static void print(double[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
