package com.sorting;

import java.util.Arrays;

public class EfficientMinDiff {

	public static void main(String[] args) {
		 int arr[] = new int[]{10,8,1,4};
			//int arr[] = new int[]{5,3,8,4,2,7,1,10};
	        
	        int n = arr.length;
	        int res=minimumDiff(arr);
	        System.out.println(res);


	}

	// total complectiy -> n(log(n))
	private static int minimumDiff(int[] arr) {
		
		Arrays.sort(arr);//n(log(n))
		int res=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			res=Math.min(res, Math.abs(arr[i]-arr[i-1])); //n
		}
		
		return res;
	}

}
