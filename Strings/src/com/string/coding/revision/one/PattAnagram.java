package com.string.coding.revision.one;

public class PattAnagram {

	static final int CHAR=256;
	public static void main(String[] args) {
		String txt = "geeksforgeeks"; 
        String pat = "frog";  
        if (isPresent(txt, pat)) 
            System.out.println("Anagram search found"); 
        else
            System.out.println("Anagram search not found"); 

	}

	private static boolean isPresent(String txt, String pat) {
		// TODO Auto-generated method stub
		 int n=txt.length();
		    int m=pat.length();
		    for(int i=0;i<=n-m;i++){
		        if(isAnagram(pat,txt,i))return true;
		    }
		    return false;
		    }
	

	 static boolean isAnagram(String pat, String txt,int i) 
	    { 
	        int[] count=new int[CHAR];
	    for(int j=0;j<pat.length();j++){
	        count[pat.charAt(j)]++;
	        count[txt.charAt(i+j)]--;
	    }
	    for(int j=0;j<CHAR;j++){
	        if(count[j]!=0)return false;
	    }
	    return true;
	    } 

}
