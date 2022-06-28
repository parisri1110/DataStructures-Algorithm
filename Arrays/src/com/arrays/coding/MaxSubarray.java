package com.arrays.coding;

public class MaxSubarray {

	public static void main(String[] args) {
		int[] a= {1,2,3,7,5};
		
		int sum=12;
		int max=0;
		int s=0,i=0;
		int n=a.length;
		
		while(i<n)
		{
			while(i<n && max<sum)
			{
				max=max+a[i];
				i++;
			}
			while(max>sum)
			{
				max=max-a[s];
				s=s+1;
			}
			if(sum==max)
			{
				System.out.println(s+1);
				System.out.println(i);
				
				break;
			}
		}
		
	}

}
