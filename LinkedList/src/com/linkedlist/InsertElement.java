package com.linkedlist;


public class InsertElement {

	public static void main(String[] args) {
		Node head=null;
		head=insert(head,30);
		head=insert(head,20);
		head=insert(head,10);
		head=insert(head,5);
		printlist(head);

	}

	private static void printlist(Node head) {
	Node curr=head;
	while(curr!=null)
	{
		System.out.print(curr.data +" ");
		curr=curr.next;
	}
		
	}

	private static Node insert(Node head, int x) {
		// TODO Auto-generated method stux
		int pos=1;
		Node curr=head;
		
			Node element=new Node(x);
			element.next=curr;
			
		return element;
	}

}
