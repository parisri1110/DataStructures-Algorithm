package com.recursion.coding;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag;
		
		System.out.println("Enter a new String");
		String str=sc.nextLine();
		
		int n=str.length();
		
		int start=0;
		int end=n-1;
		
		flag=isPal(str,start,end);
		System.out.println(flag);

	}

	private static boolean isPal(String str, int start, int end) {
		// TODO Auto-generated method stub
		if(start>=end)
			return true;
		else
		return (str.charAt(start)==str.charAt(end)) && isPal(str,start+1,end-1);
	}

	

}
