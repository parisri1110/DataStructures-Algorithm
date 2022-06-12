package com.recursion.coding;

import java.util.Scanner;

public class SumTalRecursiveRecursion {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println("enter value of sum");
		int s=sc.nextInt();
		
		int out=sum(n,s);
		System.out.println(out);
	}

	private static int sum(int n, int s) {
		
		if(n==0)
			return s;
		return sum(n-1 , s+n);
	}

}
