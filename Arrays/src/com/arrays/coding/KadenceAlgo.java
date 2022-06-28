package com.arrays.coding;

public class KadenceAlgo {

	public static void main(String[] args) {
		//int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		int[] a= {1,2,3,7,5};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));

	}

	private static int maxSubArraySum(int[] a) {
		// TODO Auto-generated method stub
		int res=Integer.MIN_VALUE;
		int max=0;
		int sum=12;
		int start = 0,last=0,s=0;
		for(int i=0;i<a.length;i++)
		{
			max=max+a[i];
			if(res<max )
			{
				res=max;
				
				  start=s; last=i;
				 
			}
			if(max<0)
			{
				max=0;
				start=i+1;
			}
			if(sum==max)
			{
				System.out.println("Starting index " + start);
		        System.out.println("Ending index " + last);
			}
		}
		 
		return max;
	}

}
