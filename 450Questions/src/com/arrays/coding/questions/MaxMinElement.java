package com.arrays.coding.questions;

public class MaxMinElement {

	public static void main(String[] args) {
int arr[] = new int[]{10,80,30,90,40,50,70};
        
        int n = arr.length;
      int res=  max(arr);
      int res1=min(arr);
        
	    System.out.println(res);
	    System.out.println(res1);

	}

	private static int max(int[] arr) {
		int max=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[max])
			{
				max=i;
			}
		}
		return arr[max];
	}

	private static int min(int[] arr) {
		// TODO Auto-generated method stub
		int min=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[min])
			{
				min=i;
			}
		}
		return arr[min];
	}

}
