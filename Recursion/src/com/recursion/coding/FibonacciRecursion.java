package com.recursion.coding;

import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		int out =fibonacci(n);
		System.out.println(out);

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
