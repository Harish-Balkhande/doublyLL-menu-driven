package com.app.stacks;

import java.util.EmptyStackException;

public class LinkedListStack {
	Node top;
	
	public LinkedListStack() {
		this.top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top =newNode;
	}
	
	public void pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}else {
//			int data = top.data;
			top = top.next;
//			return data;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public void display() {
		if(isEmpty())
			throw new EmptyStackException();
		Node trav = top;
		while(trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
}
