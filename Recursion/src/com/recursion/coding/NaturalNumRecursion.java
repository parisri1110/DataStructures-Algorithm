package com.recursion.coding;

import java.util.Scanner;

public class NaturalNumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		printNatural(n);

	}

	private static void printNatural(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		System.out.println(n +" ");
		printNatural(n-1);
		
	}

}
