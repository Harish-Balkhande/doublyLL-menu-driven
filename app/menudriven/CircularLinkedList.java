package com.app.menudriven;

public class CircularLinkedList {
	Node head;
	Node tail;
	int size;
	
	public CircularLinkedList() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void insertAtBeg(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			tail = newNode;
			head.next=tail;
			head.prev=newNode;
		}else {
			Node trav = head;
			int travpos=0;
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			head.prev=tail;
			tail.next=head;
		}
		size++;
	}
	
	public void insertAtEnd(int data) {
		if(isEmpty())
			insertAtBeg(data);
		else {
			Node newNode = new Node(data);
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
			tail.next=head;
			head.prev=tail;
			size++;
		}
	}
	
	//insert by position
	public void insertByPos(int pos, int data) {
		Node newNode = new Node(data);
		if(pos==0)
			insertAtBeg(data);
		else {
			Node trav = head;
			int travpos=0;
			while(travpos < pos-1) {
				trav=trav.next;
				travpos++;
				System.out.println("check");
			}
			newNode.next = trav.next;
			newNode.prev=trav;
			trav.next.prev=newNode;
			trav.next=newNode;
			size++;
		}
	}
	
	//display
	public void display() {
		if(isEmpty()) {
			System.out.println("LinkedList is empty");
		}else {
			Node trav = head;
			do {
				System.out.println(trav.data);
				trav=trav.next;
			}while(trav != head);
			System.out.println();
		}
		
	}
}














