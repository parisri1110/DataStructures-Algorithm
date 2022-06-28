package com.linkedlist;

public class InsertPostion {

	public static void main(String[] args) {
	Node head=new Node(10);
	head.next=new Node(20);
	head.next.next=new Node(30);
	head.next.next.next=new Node(40);
	printlist(head);
	int pos=8;
	int data=45;
	head=insert(head,pos,data);
	//System.out.print(head);
	System.out.println();
	printlist(head);

	}

	private static Node insert(Node head, int pos, int data) {
		
		Node temp=new Node(data);
		if(pos==1)
		{
			temp.next=head;	
			return temp;
		}
		Node curr=head;
		for(int i=1;i<=pos-2 && curr!=null;i++)
		{
			curr=curr.next;
		}
		if(curr==null)
		{
			return head;
		}
		temp.next=curr.next;
		curr.next=temp;
		
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
