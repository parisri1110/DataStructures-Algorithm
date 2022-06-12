package com.arrays.coding;

public class SlidingWindow {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));

	}

	private static int maxSum(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		
		if(n<=k)
		{
			System.out.println("Invalid");
			return -1;
		}
		
		int res=Integer.MIN_VALUE;
		int currsum=0;
		for(int i=0;i<k;i++)
		{
			currsum=currsum+arr[i];
		}
		
		int maxsum=currsum;
		for(int i=k;i<n;i++)
		{
			maxsum=maxsum+arr[i]-arr[i-k];
			res=Math.max(maxsum, res);
		}
		
		return res;
	}

}
