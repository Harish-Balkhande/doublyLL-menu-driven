package com.app.stacks;

public class Stack {
	private int[] arr;
	private int top;
	private int size;
	
	public Stack(int size) {
		this.size = size;
		this.top = -1;
		this.arr = new int[size];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == size-1);
	}
	
	public int getSize() {
		return top+1;
	}
	
	public void push(int data) {
		if(isFull())
			System.out.println("Stack overflow");
		else {
			arr[++top] = data;
		}
	}

	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else 
			return arr[top--];
	}
	
	//display
	public void display() {
		for(int i=top; i>=0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
}
