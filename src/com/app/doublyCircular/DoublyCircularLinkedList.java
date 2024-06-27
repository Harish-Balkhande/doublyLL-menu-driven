package com.app.doublyCircular;

public class DoublyCircularLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public DoublyCircularLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// method to check if list is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// method to get the size of the list
	public int getSize() {
		return this.size;
	}

	// insert at beginning
	public void insertAtBeg(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			head.next = tail;
//            tail.prev = head;
			head.prev = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			head.prev = tail;
			tail.next = head;
		}
		size++;
	}

	// insert at end
	public void insertAtEnd(int data) {
		if (isEmpty())
			insertAtBeg(data);
		else {
			Node newNode = new Node(data);
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = head;
			head.prev = tail;
			size++;
		}
	}

	// insert at middle
	public void insertByPos(int pos, int data) {
		Node newNode = new Node(data);
		if (pos == 0)
			insertAtBeg(data);
		else if (pos >= size)
			insertAtEnd(data);
		else {
			Node trav = head;
			int travpos = 0;
			while (travpos < pos - 1) {
				trav = trav.next;
				travpos++;				
			}			
			newNode.next = trav.next;
			newNode.prev = trav;
			trav.next.prev = newNode;
			trav.next = newNode;
			size++;
		}
	}
	
	//delete by posotion
	public void delByPos(int pos) {
		if(head == null)
			System.out.println("LinkedList is empty");
		else if(pos == 0) {
			head = head.next;
			head.next.prev = tail;
			tail.next = head;
		}
		else if(pos >= size)
			System.out.println("Index out of bound");
		else {
			Node trav = head;
			int travpos = 0;
			while(travpos < pos-1) {
				trav = trav.next;
				travpos++;
			}
			trav.next = trav.next.next;
			trav.next.next.prev = trav;
		}
	}

	// print list
	public void printList() {
		if (isEmpty()) {
			System.out.println("LinkedList is empty");
			return;
		}
		Node trav = head;
		do {
			System.out.println(trav.data + " ");
			trav = trav.next;
		} while (trav != head);
		System.out.println();
	}
}
