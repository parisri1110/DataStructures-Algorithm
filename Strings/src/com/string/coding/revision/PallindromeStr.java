package com.string.coding.revision;

import java.util.Scanner;

public class PallindromeStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag;
		
		System.out.println("Enter a new String");
		String str=sc.nextLine();
		
		int low=0;
		int high=str.length();
		
		while(low<high)
		{
			if(str.charAt(low)!=str.charAt(low))
			{
				System.out.println("false");
				break;
			}
			else
				high++;
			low--;
			System.out.println("yes");
			break;
		}

	}

}
