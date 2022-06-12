package com.recursion.coding;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		int count=0;
		int out=count(n);
		System.out.println(out);
	}

	private static int count(int n) {
		// TODO Auto-generated method stub
		if(n<10)
			return 1;
		
		return count(n/10)+1;
	}

}
