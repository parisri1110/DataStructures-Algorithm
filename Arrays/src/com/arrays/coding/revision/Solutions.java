package com.arrays.coding.revision;

import java.util.Arrays;

public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,2,1};
		int b[]= {3,2,5,6,7};
		
		int n=a.length;
		int m=b.length;
		
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0;
		for(int j=0;j<n;)
		{
			if(i<m-1 && b[i]<a[j])
			{
				i=i+1;
				
			}
			else
				j=j+1;
			if(a[j]==b[i])
				System.out.println(a[j]);
		}

	}

}
