package com.app.menudriven;

public class Node {
	Node prev;
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.prev=null;
		this.next=null;
	}
}
