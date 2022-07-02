package com.queue;

public class MyQueue {

	int front,size;
	int rear;
	int cap;
	int arr[];
	
	public MyQueue(int c)
	{
		this.cap=c;
		this.front=this.size=0;
		this.rear=cap-1;
		this.arr=new int[this.cap];
	}
	
	boolean isFull(MyQueue q) {
		return (q.size==q.cap);
	}
	
	boolean isEmpty(MyQueue q)
	{
		return (q.size==0);
	}

	public void Dequeue(int i) {
	
		
	}

	public void enqueue(int i) {
		if(isFull(this))
			return ;
		int rear=getRear();
		rear=(rear+1)%cap;
		arr[rear]=i;
		size++;
		System.out.println(i);
		
		
	}
	
	int dequeue()
	{
		if(isEmpty(this))
			return cap ;	
		front=(front+1)%cap;
		 size--;
		return front;
	}

	int getFront()
	{
		if(isEmpty(this))
			return -1;
		else
		return front;
		
	}
	
	int getRear()
	{
		if(isEmpty(this))
			return -1;
		else
		return (front+rear-1)%cap;
		
	}
	
	
}
