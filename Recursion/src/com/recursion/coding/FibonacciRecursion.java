package com.recursion.coding;

import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		  System.out.println("Enter number"); int n=sc.nextInt();
		 
		
			/*
			 * for(int i=0;i<20;i++) { System.out.println(fibonacci(i)); }
			 */
		
		  int out =fibformula(n);
		  System.out.println(out);
		 

	}
	
	static int fibformula(int n)
	{
		return (int) (Math.pow((1+Math.sqrt(5))/2, n)-Math.pow((1+Math.sqrt(5))/2, n) /Math.sqrt(5));
	}

	private static int fibonacci(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
