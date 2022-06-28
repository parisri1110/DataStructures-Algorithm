package com.linkedlist;

public class DeleteHead {

	public static void main(String[] args) {
	
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		printlist(head);
System.out.println("delete ++++++++++");
head=delete(head);
printlist(head);

	}

	private static Node delete(Node head) {
		if(head==null)
		{
			return null;
		}
		return head.next;
		
	}

	private static void printlist(Node head) {
		
		Node curr=head;
		while(curr.next!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		
	}

}
