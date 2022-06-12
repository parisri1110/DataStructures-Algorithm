package com.recursion.coding;

import java.util.Scanner;

public class PallindromeInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter a new number");
		int n=sc.nextInt();
		
		int low=0;
		int high=n-1;
		
		int temp=isPal(n,0);
		if(temp==n)
			System.out.println(1);
		else
        System.out.println(0);
		
	}

	private static int isPal(int n, int i) {
		// TODO Auto-generated method stub
		
		if(n==0)
			return i;
			i=(i*10)+(n%10);
		return isPal(n/10,i);
	}

	

}
