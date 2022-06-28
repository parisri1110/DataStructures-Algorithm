package com.linkedlist;

public class MiddleElement {

	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		printlist(head);
		System.out.println();
		middle(head);

	}

	private static void middle(Node head) {
		if(head==null)
			return;
		Node slow=head,fast=head;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);
		
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
