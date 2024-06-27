package com.app.queue;

public class Queue {
	int[] arr;
	int capacity;
	int front;
	int rear;
	int count;
	
	public Queue(int size) {
		this.capacity = size;
		this.arr = new int[size];
		this.front = 0;
		this.rear = -1;
		this.count = 0;
	}
	
	public boolean isEmpty() {
		return (rear==-1);
	}
	
	public int size() {
		return count;
	}
	
	public boolean isFull() {
		return size()==capacity;
	}
	
	public void push(int data) {
		if(isFull()) 
			System.out.println("Queue is overflow");
		else {
			rear = (rear+1)%capacity;
			arr[rear]=data;
			count++;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Queue is underflow");
		}else {
			front++;
//			count--;
		}
	}
	
	public void print() {
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			int i;
			for(i=front;i<count;i++) {
				System.out.println(arr[i]);
			}
			System.out.println();
		}
	}
}
