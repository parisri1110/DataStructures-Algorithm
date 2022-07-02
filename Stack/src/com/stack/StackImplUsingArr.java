package com.stack;

public class StackImplUsingArr {

	public static void main(String[] args) {
		MyStack s=new MyStack(5);
		s.push(10);
		s.push(15);
		s.push(20);
		System.out.println(s.peek());
		System.out.println(s.pop());
	}

}
