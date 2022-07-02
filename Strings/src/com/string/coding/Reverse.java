package com.string.coding;

import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag;
		
		System.out.println("Enter a new String");
		Pattern p=Pattern.compile(".");
		String str="hello";
		String str1="i.like.this.program.very.much";
		String result="";
		String temp1[]=p.split(str1);
		
		for(int i=0;i<temp1.length;i++)
		{
			if(i==temp1.length-1)
			{
				result=temp1[i]+result;
			}
			else
			{
				result=" " + temp1[i] + result;
			}
		}
		
		System.out.println(result);
		
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
		
		  for (char c : temp) { System.out.print(c); }
	
	}

}
