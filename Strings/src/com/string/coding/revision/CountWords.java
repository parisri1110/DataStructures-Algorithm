package com.string.coding.revision;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=" World is hello";
		String[] words=str.split("\s");
		
		
		{
			System.out.println(words.length);
		}

		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
				
			}
		}
		System.out.println("through loop :" +(count+1));
	}

}
