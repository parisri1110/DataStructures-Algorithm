package com.linkedlist;

public class NaiveMiddleElement {

	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(5);
		head.next.next=new Node(20);
		head.next.next.next=new Node(15);
		head.next.next.next.next=new Node(25);
		printlist(head);
		System.out.println();
		middle(head);

	}
	private static void middle(Node head) {
		
		Node curr=head;
		int count=0;
		
		for(curr=head;curr!=null;curr=curr.next)
		{
			count++;
		}
		curr=head;
		for(int i=0;i<count/2;i++)
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
