package com.arrays.coding.questions;

public class MaxSumK {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));
	}

	private static int maxSubArraySum(int[] a) {
		 int curr_sum = a[0], start = 0;
		 int sum=15;
		 int n=a.length;
	        // Pick a starting point
	        for (int i = 1; i <= n; i++) {
	            // If curr_sum exceeds the sum,
	            // then remove the starting elements
	            while (curr_sum > sum && start < i - 1) {
	                curr_sum = curr_sum - a[start];
	                start++;
	            }
	 
	            // If curr_sum becomes equal to sum,
	            // then return true
	            if (curr_sum == sum) {
	                int p = i - 1;
	                System.out.println(
	                    "Sum found between indexes " + start
	                    + " and " + p);
	                return 1;
	            }
	 
	            // Add this element to curr_sum
	            if (i < n)
	                curr_sum = curr_sum + a[i];
	        }
	 
	        System.out.println("No subarray found");
	        return 0;
	}

}
