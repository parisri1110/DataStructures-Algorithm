package com.recursion.coding;

import java.util.Scanner;

public class SubsetsRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a new String");
		//String str=sc.nextLine();
		String str="abc";
		
		int n=str.length();
		
		int index=0;
		String current="";
		subset(str,current,index);

	}

	private static void subset(String str, String current, int index) {
		
		if(index==str.length())
		{
			System.out.println(current + " ");
			return;
		}
		
		subset(str,current,index+1);
		subset(str,current+str.charAt(index),index+1);
		
		
	}

}
