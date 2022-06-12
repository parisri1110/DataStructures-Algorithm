package com.string.coding.patternsearching;

public class NaivePatternSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt= "ABCABCD";
		String pat= "ABCD";
				
				patternSearch(txt,pat);

	}

	private static void patternSearch(String txt, String pat) {
		// TODO Auto-generated method stub
		int n=txt.length();
		int m=pat.length();
		
		for(int i=0;i<=n-m;i++)
		{
			int j;
			for(j=0;j<m;j++)
			{
				if(pat.charAt(j)!=txt.charAt(i+j))
					break;
			}
			if(j==m)
			{
				System.out.println(i);
			}
		}
		
	}

}
