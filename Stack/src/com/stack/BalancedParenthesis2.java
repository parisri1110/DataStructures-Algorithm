package com.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedParenthesis2 {

	public static void main(String[] args) {
		String str="({()})";
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
		
		Stack<Character> c=new Stack<>();
		
		for(int i=0;i<str.length();i++)
		{
			char x=str.charAt(i);
			if(x=='('||x=='{' || x=='[')
			{
				c.push(x);
				continue;
			}
			if(c.isEmpty())
				return false;
			char res;
			switch(x)
			{
			case ')':
				res=c.pop();
				if(res=='{'|| res=='[')
					return false;
				break;
				
			case '}':
				res=c.pop();
				if(res=='('|| res=='[')
					return false;
				break;
				
			case ']':
				res=c.pop();
				if(res=='{'|| res=='(')
					return false;
				break;
			}
			
				
		}
		
		return (c.isEmpty()==true);
	}

	private static boolean matching(char a, char b) {
		// TODO Auto-generated method stub
		return ((a=='('&& b==')')||( a=='{' && b=='}' )||( a=='[' && b==']' ));
	}

}
