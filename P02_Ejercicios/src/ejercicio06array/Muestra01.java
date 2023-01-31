//Desarrolar un método que muestre un array de Doubles por pantalla
package ejercicio06array;

public class Muestra01 {
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
		System.out.print("{");	
		for(int i = 0; i < nums.length; i++) {
			if(i<nums.length-1) {				
				System.out.print(nums[i] + ", ");
			} else {
				System.out.print(nums[i]);			
			}
		}
		System.out.println("}");	
	}
	
	public static void print(int[] nums) {
		System.out.print("{");	
		for(int i = 0; i < nums.length; i++) {
			if(i<nums.length-1) {				
				System.out.print(nums[i] + ", ");
			} else {
				System.out.print(nums[i]);	
			}
		}
		System.out.println("}");	
	}
}
