package com.string.coding;

import java.util.Scanner;

public class RecursiveSubseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1 = "ABCDE";
		String s2 = "AED";
		
		int n=sc.nextInt();
		//System.out.println(n);
		int m=sc.nextInt();
		
		
		boolean res=sub(s1,s2,n,m);
		
		
		
	}

	private static boolean sub(String s1, String s2, int n, int m) {
		// TODO Auto-generated method stub
		if(n==0)
			System.out.println("false");
		if(m==0)
			System.out.println("true");
			if(s1.charAt(n-1)==s2.charAt(m-1))
				return sub(s1,s2,n-1,m-1);
			else
				return sub(s1,s2,n-1,m);
		
		
		
	}

}
