package com.string.coding;

import java.util.Iterator;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag;
		
		System.out.println("Enter a new String");
		String str=sc.nextLine();
		
		int low=0;
		int high=str.length()-1;
		char[] temp=str.toCharArray();
		//char []str1=new char[str.length()];
		while(low<high)
		{
			char rev=temp[low];
			temp[low]=temp[high];
			temp[high]=rev;
			low++;
			high--;
		}
		
		  for (char c : temp) { System.out.println(c); }
	
	}

}
