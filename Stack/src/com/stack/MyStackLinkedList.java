package com.stack;

public class MyStackLinkedList {

	int size;
	Node head;;
	
	 
	MyStackLinkedList()
	{
		this.head=null;
		this.size=0;
		
	}
	
	public MyStackLinkedList(int i) {
		// TODO Auto-generated constructor stub
	}

	int size()
	{
		return size;
	}

	boolean isEmpty()
	{
		if(head==null)
		{
			return false;
		}
		return true;
	}
	
	void push(int x)
	{
		Node temp=new Node(x);
		temp.next=head;
		head=temp;
		size++;
	}
	
	int pop()
	{
		if(head==null)
		{
			System.out.println("no element is present");
			return Integer.MAX_VALUE;
		}
		int res=head.data;
		head=head.next;
		size--;
		return res;
	}
	
	int peek()
	{
		if(head==null)
		{
			return Integer.MIN_VALUE;
		}
		return head.data;
	}
}
