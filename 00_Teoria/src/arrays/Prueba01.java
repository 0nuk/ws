package arrays;
public class Prueba01 {
	public static void main(String[] args) {
		
		int[] nums = new int[4];
		nums[0] = 345;
		nums[1] = 123;
		nums[2] = 55;
		nums[3] = 78;
		
		for (int i=0; i < nums.length; i++) {
			System.out.println(i + " : " + nums[i]);
		}
		
		nums = new int[4];
		for (int i=0; i < nums.length; i++) {
			System.out.println(i + " : " + nums[i]);
		}
	}
}
