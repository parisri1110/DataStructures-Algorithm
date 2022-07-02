package com.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String str="({[]})";
		if(balanced(str))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("not balanced");
		}

	}

	private static boolean balanced(String str) {
		
		Deque<Character> c=new ArrayDeque<>();
		
		for(int i=0;i<str.length();i++)
		{
			char x=str.charAt(i);
			if(x=='('||x=='{' || x=='[')
			{
				c.push(x);
				continue;
			}
			
			else {
				if(c.isEmpty()==false)
				{
					return false;
				}
				else if(matching(c.peek(),x)==false)
				{
					return false;
				}
				else
					c.pop();
			}
			
				
		}
		
		return (c.isEmpty()==true);
	}

	private static boolean matching(char a, char b) {
		// TODO Auto-generated method stub
		return ((a=='('&& b==')')||( a=='{' && b=='}' )||( a=='[' && b==']' ));
	}

}
