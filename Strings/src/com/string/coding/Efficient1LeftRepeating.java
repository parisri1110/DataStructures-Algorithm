package com.string.coding;

public class Efficient1LeftRepeating {

	static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abscced";
		
		int res=leftrep(str);
		
		System.out.println(res);

	}

	private static int leftrep(String str) {
		// TODO Auto-generated method stub
		boolean track[]=new boolean[CHAR];
		int res=-1;
		
		for(int i=str.length()-1;i>0;i--)
		{
			if(track[str.charAt(i)])
			{
				res=i;
			}
			else
				track[str.charAt(i)]=true;
				
		}
			
		return res;
	}

}
