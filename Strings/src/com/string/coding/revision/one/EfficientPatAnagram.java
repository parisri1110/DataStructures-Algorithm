package com.string.coding.revision.one;

public class EfficientPatAnagram {

	static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "geeksforgeeks"; 
        String pat = "weks";  
        if (isPresent(txt, pat)) 
            System.out.println("Anagram search found"); 
        else
            System.out.println("Anagram search not found");

	}
	private static boolean isPresent(String txt, String pat) {
		// TODO Auto-generated method stub
		int CT[]=new int[CHAR];
		int CP[]=new int[CHAR];
		
		for(int i=0;i<pat.length();i++)
		{
			CT[txt.charAt(i)]++;
			CP[pat.charAt(i)]++;
		}
		
		for(int i=pat.length();i<txt.length();i++)
		{
			  if(areSame(CT,CP))return true;
			  
			  CT[txt.charAt(i)]++;
			  CP[txt.charAt(i-pat.length())]--;
		}
		return false;
	}
	
	static boolean areSame(int CT[],int CP[]){
	    for(int i=0;i<CHAR;i++){
	        if(CT[i]!=CP[i])return false;
	    }
	    return true;
	    }

}
