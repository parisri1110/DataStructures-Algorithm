package com.string.coding;

import java.util.Scanner;

public class EfficientPallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag;
		
		System.out.println("Enter a new String");
		String str=sc.nextLine();
		
		int low=0;
		int high=str.length()-1;
		while(low<high)
		{
			if(str.charAt(high)!=str.charAt(low)) {
				System.out.println("not");
				break;
			}
			else
				low++;
			high--;
			System.out.println("yes");
			break;
			
		}
		
	}

}
