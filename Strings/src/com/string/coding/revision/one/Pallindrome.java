package com.string.coding.revision.one;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag;
		
		System.out.println("Enter a new String");
		String str=sc.nextLine();
		
		int low=0;
		int high=str.length()-1;
		
		while(low<high)
		{
			if(str.charAt(low)!=str.charAt(high))
			{
				System.out.println("not a pallindrome");
				break;
			}
			else
				low++;
			high--;
			System.out.println("pallindrome");
			break;
		}

	}

}
