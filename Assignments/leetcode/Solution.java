package leetcode;

class Solution {
	public static int[] maxSlidingWindow(int[] nums, int k) {

		int arr[] = new int[nums.length - (nums.length / k)];

		for (int i = 0; i < nums.length - k + 1; i++) {
			int temp = Integer.MIN_VALUE;
			for (int j = i; j < i + k; j++) {
				if (temp < nums[j])
					temp = nums[j];
			}
			arr[i] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1};
		int k = 1;
		
		//if(nums.length==1 && )
		
		int arr[]=maxSlidingWindow(nums,k);
		
		for(int num:arr)
			System.out.println(num);
				

	}

}
