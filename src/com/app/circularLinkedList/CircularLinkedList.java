package com.app.circularLinkedList;

public class CircularLinkedList {
	Node head;
	int count;

	public CircularLinkedList() {
		this.head = null;
		this.count = 0;
	}

	// insert at beginning
	public void insertAtBeg(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			newNode.next = head;
			
		} else {
			Node trav = head;
			while (trav.next != head) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.next = head;
			head = newNode;
		}
		count++;
	}

	// insert at last
	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			Node trav = head;
			while (trav.next != head) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.next = head;
			count++;
		}
	}

	// insert by given position
	public void insertByPos(int pos, int data) {
		Node newNode = new Node(data);
		if (head == null && pos >= 0) {
			head = newNode;
			pos = 0;
		} else {
			Node trav = head;
			int travPos = 0;
			if (pos > count)
				System.out.println("Position excedds maximum index ");
			while (travPos < pos-1) {
				trav = trav.next;
				travPos++;
			}
			newNode.next = trav.next;
			trav.next = newNode;
			count++;
		}

	}
	
	//delete by given position
	public void deleteByPos(int pos) {
		if(head == null) {
			System.out.println("LinkedList is empty");
		}else if(pos > count) {
			System.out.println("Index out of bound");
		}else {
			Node trav = head;
			int travPos = 0;
			while(travPos < pos-1) {
				trav = trav.next;
				travPos++;
			}
			trav.next = trav.next.next;
		}		
	}

	public void printList() {
		if (head == null)
			System.out.println("List is empty");
		Node trav = head;
		do {
			System.out.println(trav.data + " ");
			trav = trav.next;
		} while (trav != head);
		System.out.println();
	}
}
