package com.linkedlist;

public class NthNode {

	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(5);
		head.next.next=new Node(20);
		head.next.next.next=new Node(15);
		head.next.next.next.next=new Node(25);
		printlist(head);
		int n=2;
		System.out.println();
		nth(head,n);

	}

	private static void nth(Node head,int n) {
		int len=0;
		Node curr=head;
		
		for(curr=head;curr!=null;curr=curr.next)
		{
			len++;
		}
		curr=head;
		for(int i=1;i<len-n+1;i++)
		{
			curr=curr.next;
		}
		System.out.println(curr.data);
		
	}

	private static void printlist(Node head) {
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
		curr=curr.next;	
		}
		
		
	}
}
