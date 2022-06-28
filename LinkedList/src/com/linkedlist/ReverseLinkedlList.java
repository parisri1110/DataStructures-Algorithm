package com.linkedlist;

public class ReverseLinkedlList {

	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(5);
		head.next.next=new Node(20);
		head.next.next.next=new Node(15);
		head.next.next.next.next=new Node(25);
		printlist(head);
		int n=2;
		System.out.println();
		head=reverse(head);
		printlist(head);
	}

	private static Node reverse(Node head) {
		Node curr=head;
		Node prev=null;
		
		while(curr!=null)
		{
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr = next;
		} 
		return prev;
		
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
