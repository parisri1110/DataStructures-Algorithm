package com.recursion.coding;

import java.util.Scanner;

public class TowerOfHanoiGeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		
		int n=sc.nextInt();
		
		int from=1;
		/*
		 * int to=2; int aux=3;
		 */
		int to=3;
		int aux=2;
		
		long res=TOH(n,from,to,aux);
		System.out.println(res);

	}

	private static long TOH(int n, int from, int to, int aux) {
		
		if(n==1)
		{
			System.out.println("Move disc 1 from rod " + from + " to rod " + to);
			return n;
			
		}
		TOH(n-1,from,aux,to);
		System.out.println("Move disc " + n + " from rod " + from + " to rod " + to);
		TOH(n-1,aux,to,from);
		return  (long) ((Math.pow(2, n))-1);
		// TODO Auto-generated method stub
		
	}

}
