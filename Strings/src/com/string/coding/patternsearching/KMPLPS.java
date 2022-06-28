package com.string.coding.patternsearching;

public class KMPLPS {

	public static void main(String[] args) {
		 String txt = "cabca";
		 int[] lps=new int[txt.length()];
	        fillLPS(txt,lps);
	        for(int i=0;i<txt.length();i++){
	            System.out.print(lps[i]+" ");
	}

}

	private static void fillLPS(String str, int[] lps) {
		// TODO Auto-generated method stub
		
		int n=str.length();
		int len=0;
		lps[0]=0;
		int i=1;
		while(i<n)
		{
			if(str.charAt(i)==str.charAt(len))
			{
				len++;
				lps[i]=len;
				i++;
			}
			else
				if(len==0)
				{
					lps[i]=0;
					i++;
				}
				 else{
					 len=lps[len-1];
					 }
		}
		
	}
}
