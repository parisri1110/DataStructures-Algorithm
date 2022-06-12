package com.sorting;

public class MinimumDifference {

	public static void main(String[] args) {
		  int arr[] = new int[]{1,8,12,5,18};
			//int arr[] = new int[]{5,3,8,4,2,7,1,10};
	        
	        int n = arr.length;
	        int res=minimumDiff(arr);
	        System.out.println(res);

	}

	private static int minimumDiff(int[] arr) {
		// TODO Auto-generated method stub
		int res=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				 res=Math.min(res, Math.abs(arr[i]-arr[j]));
			}
			
		}
		return res;
		
	}

}
