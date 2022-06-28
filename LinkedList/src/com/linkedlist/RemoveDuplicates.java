package com.linkedlist;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(20);
		head.next.next.next=new Node(30);
		head.next.next.next.next=new Node(30);
		printlist(head);
		System.out.println();
		head=duplicate(head);
		printlist(head);
	}

	private static Node duplicate(Node head) {
		Node curr=head;
		
		while(curr!=null && curr.next!=null)
		{
			if(curr.data==curr.next.data)
			{
				curr.next=curr.next.next;
			}
			curr=curr.next;
		}
		return head;
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
