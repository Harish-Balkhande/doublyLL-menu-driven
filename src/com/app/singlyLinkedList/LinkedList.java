package com.app.singlyLinkedList;

public class LinkedList {
	Node head;
	int count;	

	public LinkedList() {
		this.head = null;
		this.count = 0;
	}

	//Insert at beginning
	public void insertAtBeg(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new_node;
		} else {
			new_node.next = head;
			// add data to newly created node
			// new_node.data = new_data;
			// assign head to newly inserted node
			head = new_node;
		}
		count++;
	}

	//insert at end
	public void insertAtEnd(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new_node;
		}else {
			Node node = head;
			while(node.next != null) {
				node = node.next;				
			}
			node.next = new_node;			
		}
		count++;
	}
	
	//insert at given position
	public void insertByPosition(int pos, int data) {
		Node new_node = new Node(data);
//		System.out.println(new_node.data);
//		if( pos == 0) {
		if(head == null  ) {
			insertAtBeg(data);
		}else if(pos == count)
			insertAtEnd(data);
		else {
			Node trav = head;
			int travPos = 0;
			while(trav.next!= null && travPos < pos-1) {
				trav = trav.next;
				travPos++;
			}
			//System.out.println(" trav data :" +trav.data);
			new_node.next = trav.next;
			trav.next= new_node;
		}
	}
	
	//delete by position
	public void deleteByPos(int pos) {
		Node trav = head;
		int travPos = 0;
		while(travPos < pos-1) {
			trav = trav.next;
			travPos++;
//			System.out.println("trav1: " +trav.data+ " "+travPos);
		}
		trav.next = trav.next.next;
//		System.out.println("trav2: " +trav.data+ " "+travPos);
	}
	
	//Print the LinkedList
	public void printList() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
}
