package com.string.coding;

import java.util.Arrays;

public class Efficient2LeftRepeating {

	static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       String str = "abscced";
		
		int res=leftrep(str);
		
		System.out.println(res);
	}

	private static int leftrep(String str) {
		// TODO Auto-generated method stub
		int fidx[] = new int[CHAR];
		
		Arrays.fill(fidx, -1);
	   int res=Integer.MAX_VALUE;
	   
	   for(int i=0;i<str.length();i++)
	   {
		   fidx[i]=str.charAt(i);
	   }
		
	   for(int i=0;i<str.length();i++)
	   {
		 int fi=fidx[str.charAt(i)];
		// System.out.println(fi);
		 if(fi==-1)
			 fidx[str.charAt(i)]=i;
		  else
			  res=Math.min(res, i);
	   }
		return (res==Integer.MAX_VALUE)?-1:res;
	}

}
