package com.arrays;

import java.util.ArrayList;

public class ReverseArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		int n=5;
		int k=3;
		
		for(int i=1;i<=n;i++)
		{
			arr.add(i);
			
			
		}
		for(int i=0;i<n;i=i+k)
        {
            int low=i;
            int high=Math.min(i+k-1,n-1);
            while(low<=high){
            int temp=arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);
            low++;
            high--;
            }
        }
		System.out.println(arr);

	}

}
