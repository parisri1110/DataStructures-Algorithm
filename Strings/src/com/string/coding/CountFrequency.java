package com.string.coding;

public class CountFrequency {

	public static void main(String[] args) {

		String str="aaabbbbbbbbbbbbbbbbbbbbbbbbbaaaddddddddeeeeeeeffnnnnnnnnn";
		int count[]=new int[256];
		int res=Integer.MAX_VALUE;
		
		char String[]=str.toCharArray();
		char max=str.charAt(0);
		
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
			
			
		}
		
		
		int maxx=0;
		int result=0;
		for (int i = 0; i < 256; i++) {
			if (count[i] >= 1) {
				System.out.println("team " + (char) (i) + ":" + " " + count[i]);
				if (count[i] > maxx) {
					maxx = count[i];
				}

			}			
		}
		System.out.println("The team is " +  + maxx);
		
		
	}

}
