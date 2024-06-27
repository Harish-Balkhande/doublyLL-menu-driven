package com.app.doublyLL;

public class DoublyLL {
	Node head;
	Node tail;
	int size;

	public DoublyLL() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// insert at beginning
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}

	// insert at last
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	// insert at index position
	public void insertByPos(int pos, int data) {
		Node newNode = new Node(data);
		if (head == null && pos == 0) {
			head = newNode;
			tail = newNode;
		} else if (pos >= size)
			System.out.println("Index out of bound");
		else {
			Node trav = head;
			int travpos = 0;
			while (head.next != null && travpos < pos - 1) {
				trav = trav.next;
				travpos++;
			}
			newNode.next = trav.next;
			newNode.prev = trav;
			trav.next.prev = newNode;
			trav.next = newNode;
			tail = newNode;
		}
		size++;
	}

	// delete First
	public void deleteFirst() {
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			head = head.next;
			head.prev = null;
		}
		size--;
	}

	// delete Last
	public void deleteLast() {
		if (head == null)
			System.out.println("Linked list is empty");
		else {
			tail = tail.prev;
			tail.next = null;
		}
		size--;
	}

	// delete by position
	public void deleteByPos(int pos) {
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			Node trav = head;
			int travpos = 0;
			while (travpos < pos - 1 && trav.next != null) {
				trav = trav.next;
				travpos++;
				System.out.println("trav : " + trav.data);
			}
			trav.next.next.prev = trav;
			trav.next = trav.next.next;
		}
		size--;
	}

	// delete by value
	public void delByValue(int key) {
		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node trav = head;
			while (trav.next != null) {
				if (trav.next.data == key) {
					trav.next.next.prev = trav;
					trav.next = trav.next.next;
				}
				trav = trav.next;
			}
		}
	}

	// delete duplicate
	public void deleteDuplicate() {
		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node current = head;
			while (current != null) {
				Node trav = current.next;
				while (trav != null) {
					if (trav.data == current.data) {
//						System.out.println("Delete duplicate" + trav.data);
//						trav.next.next.prev = trav;
//						trav.next = trav.next.next;
						if (trav.prev != null) {
							trav.prev.next = trav.next;
						} else {
							// If trav.prev is null, trav is the head node
							head = trav.next;
						}

						// Update prev pointer of the next node
						if (trav.next != null) {
							trav.next.prev = trav.prev;
						}
					}
					trav = trav.next;
				}
				current = current.next;
			}
		}
	}

	// search by value
	public void searchByValue(int key) {
		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node trav = head;
			int travpos = 0;
			while (trav.next != null) {
				if (trav.data == key) {
					System.out.println(key + " is found at index " + travpos);
				}
				trav = trav.next;
				travpos++;
			}
		}
	}

	// update value
	public void updateByValue(int data, int key) {
		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node trav = head;
			int travpos = 0;
			while (trav.next != null) {
				if (trav.data == data) {
					trav.data=key;					
				}
				trav = trav.next;
				travpos++;
			}
		}
	}

	// fin min
	public int findMin() {
		int min = head.data;
		Node trav = head;
		while (trav != null) {
			if (trav.data < min)
				min = trav.data;
			trav = trav.next;
		}
		return min;
	}

	public int findMax() {
		int max = head.data;
		Node trav = head;
		while (trav != null) {
			if (trav.data > max)
				max = trav.data;
			trav = trav.next;
		}
		return max;
	}

	// display
	public void display() {
		if (head == null)
			System.out.println("List is empty");
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
}
