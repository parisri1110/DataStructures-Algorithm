package com.string.coding.revision.one;

import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		
		String S="i.like.this.program.very.much";
		
		reverse(S);
		 
	}

	private static String reverse(String S) {
		 Stack<Character> st=new Stack<Character>();
	       
		 int n=S.length();
	       String str="";
	       for(int i=0;i<S.length();i++)
	       {
	    	   if(S.charAt(i)=='.')
	    	   {
	           st.push(S.charAt(i));
	           
	           st.push('.');
	    	   }
	           
	    	   if(st.isEmpty())
					return null;
	       }
	       int i=0;
	       while(i<n) {
	           Character res;
	          res=st.pop();
	          str=str+res;
	          i++;
	       }
	       return str;
		
	}

}
