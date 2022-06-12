package com.string.coding.revision;

import java.util.Scanner;

public class CountFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a new String");
		String str=sc.nextLine();
		
		int count[]=new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++)
		{
			if(count[i]>0)
			{
				System.out.println((char)(i+'a') + " " + count[i]);
				
			}
		}

	}

}
