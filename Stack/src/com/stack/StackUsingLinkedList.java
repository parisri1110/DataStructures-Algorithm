package com.stack;

public class StackUsingLinkedList {

	public static void main(String[] args) {
		MyStackLinkedList s=new MyStackLinkedList();
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(90);
		System.out.println(s.peek());
		System.out.println(s.pop());

	}

}
