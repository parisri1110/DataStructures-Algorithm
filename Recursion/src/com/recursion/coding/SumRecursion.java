package com.recursion.coding;

import java.util.Scanner;

public class SumRecursion {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		int out =sum(n);
		System.out.println(out);

	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 0;
		return n+sum(n-1);
	}

}
