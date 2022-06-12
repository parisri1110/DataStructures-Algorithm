package com.recursion.coding;

import java.util.Scanner;

public class SumDigitsRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		int out =sumDigits(n);
		System.out.println(out);

	}

	private static int sumDigits(int n) {

		if(n<10)
			return n;
		
		return sumDigits(n/10)+n%10;
	}

}
