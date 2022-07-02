package com.queue;

public class QueueUsingArray {

	public static void main(String[] args) {
	
		MyQueue q=new MyQueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.print(q.dequeue());
		System.out.println(q.getFront());
		System.out.println(q.getRear());

	}

}
