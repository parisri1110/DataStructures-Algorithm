package com.arrays.coding.revision;

import java.util.Scanner;

public class EffSecLar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[]{10,80,30,90,40,50,70};
		
		int y = secondlargest(arr);
		
		System.out.println(y);

	}

	private static int secondlargest(int[] arr) {

		int largest=0;
		int res=-1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[largest])
			{
				res=largest;
				largest=i;
			}
			else
				if(arr[i]!=arr[largest])
				{
					if(res==-1 || arr[i]>arr[res])
					{
						res=i;
					}
				}
		}
		return res;
	}

}
