package com.linkedlist;

public class NthNode2nd {

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

	private static void nth(Node head, int n) {
		// TODO Auto-generated method stub
		if(head==null)
		{
			return;
		}
		Node first=head;
		for(int i=0;i<n;i++)
		{
			if(first==null)
			{
				return;
			}
			first=first.next;
		}
		Node second=head;
		while(first!=null)
		{
			second=second.next;

			first=first.next;
		}
		System.out.println(second.data);
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
