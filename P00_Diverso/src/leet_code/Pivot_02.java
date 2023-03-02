package leet_code;

public class Pivot_02 {
	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));
		int[] nums2 = {1,2,3};
		System.out.println(pivotIndex(nums2));
		int[] nums3 = {2,1,-1};
		System.out.println(pivotIndex(nums3));
	}
	
//			Input: nums = [1,7,3,6,5,6]
//			Output: 3
//			Explanation:
//			The pivot index is 3.
//			Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//			Right sum = nums[4] + nums[5] = 5 + 6 = 11
	
	
	public static int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        for(int i = 0; i< nums.length; i++) {
        	sumLeft += nums[i];
        	for(int j = nums.length -1; j>=i; j--) {
        		sumRight += nums[j];
        	}
        	if(sumLeft == sumRight) {
        		return i;
        	}
        	sumRight = 0;
        }
        return -1;
       
	}
}
