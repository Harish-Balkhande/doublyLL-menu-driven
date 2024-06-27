package com.app.queue;

public class Main {

	public static void main(String[] args) {
		Queue q = new Queue(4);
		
		q.push(1);
		q.push(3);
		q.push(7);
		q.print();
		
		q.pop();
		q.print();
	}

}
