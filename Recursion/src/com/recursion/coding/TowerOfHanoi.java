package com.recursion.coding;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		
		int n=sc.nextInt();
		char a='A';
		char b='B';
		char c='C';
		
		
		TOH(n,a ,b,c);
		

	}

	private static void TOH(int n, char A, char B, char C) {

		if(n==1)
		{
			System.out.println("Move disc 1 from rod " + A + " to rod " + C);
			return ;
		}
	TOH(n-1,A,C,B);
	System.out.println("Move disc " + n + " from rod " + A + " to rod " + C);
	TOH(n-1,B,A,C);
		
		
	}

}
