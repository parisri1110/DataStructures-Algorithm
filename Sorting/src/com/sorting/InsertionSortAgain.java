package com.sorting;

import java.util.Arrays;

public class InsertionSortAgain {

	public static void main(String[] args) {
		 int[] arr = {5, 3, 4, 1, 2};
	        insertion(arr);
	        System.out.println(Arrays.toString(arr));

	}

	private static void insertion(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					swap(arr,j,j-1);
				}
				else
				{
					break;
				}
			}
		}
		
	}

	private static void swap(int[] arr, int j, int i) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		
	}

}
