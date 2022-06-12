package com.string.coding.revision;

import java.util.Scanner;

public class Pallin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag;
		
		System.out.println("Enter a new String");
		String str=sc.nextLine();
		
		flag=isPal(str);
		System.out.println(flag);

	}

	private static boolean isPal(String str) {
		// TODO Auto-generated method stub
		StringBuilder rev=new StringBuilder(str);
		
		rev.reverse();
		if(str.equals(rev.toString()))
			return true;
			else
				return false;
	}

}
