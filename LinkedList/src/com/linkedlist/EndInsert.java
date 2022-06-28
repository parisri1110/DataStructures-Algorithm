package com.linkedlist;

public class EndInsert {

	public static void main(String[] args) {
	
		Node head=null;
		head=insertend(head,10);
		head=insertend(head,20);
		head=insertend(head,30);
		head=insertend(head,40);
		printlist(head);
		

	}

	private static void printlist(Node head) {
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+ " ");
			curr=curr.next;
		}
		
	}

	private static Node insertend(Node head, int x) {
		Node temp=new Node(x);
		if(head==null)
		{
			return temp;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
			
		}
		curr.next=temp;
		return head;
	}

}
