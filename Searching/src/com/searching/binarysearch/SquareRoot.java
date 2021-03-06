package com.searching.binarysearch;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");

		int n = sc.nextInt();
		int res = squareRoot(n);
		System.out.println(res);


	}

	private static int squareRoot(int n) {
		int low=1;
		int high=n;
		int ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			int sq=mid*mid;
			if(sq==n)
			{
				return mid;
			}
			else
				if(sq>n)
					high=mid-1;
				else
					{low=mid+1;
					ans=mid;
					}
			
			
		}
		return ans;
	}

}
