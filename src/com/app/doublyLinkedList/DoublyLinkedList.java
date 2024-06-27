-package com.app.doublyLinkedList;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int size;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// add at begining
	public void addAtBeg(int data) {
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

	// add at last
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

	// insert by position
	public void insertByPos(int pos, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node trav = head;
			int travpos = 0;
			while (trav != null && travpos < pos - 1) {
				trav = trav.next;
				travpos++;
			}
			newNode.next = trav.next;
			trav.next = newNode;
			newNode.prev = trav;
		}
		size++;
	}

	// delete last node
	public void deleteLast() {
		if (head == null) {
			// List is empty, nothing to delete
			return;
		}

		if (head == tail) {
			// Only one node in the list
			head = tail = null;
			return;
		}

		// Traverse to the last node
		Node trav = tail.prev;

		// Adjust pointers
		trav.next = null;
		tail = trav;
	}

	// Method to delete a node at a specific index in the doubly linked list
	public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }

		Node trav = head;
		// Traverse to the node at the specified index
		for (int i = 0; i < index; i++) {
			trav = trav.next;
		}

		// Now trav points to the node to be deleted
		if (trav == head && trav == tail) {
			// Only one node in the list
			head = tail = null;
		} else if (trav == head) {
			// Node to be deleted is the head
			head = trav.next;
			head.prev = null;
		} else if (trav == tail) {
			// Node to be deleted is the tail
			tail = trav.prev;
			tail.next = null;
		} else {
			// Node to be deleted is somewhere in between
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}

		// Decrease the size of the list
        size--;
	}

	// Method to delete a node by value in the doubly linked list
	public void deleteByValue(int value) {
		Node trav = head;

		// Traverse the list to find the node with the specified value
		while (trav != null && trav.data != value) {
			trav = trav.next;
		}

		if (trav == null) {
			// Value not found in the list
			return;
		}

		// Now trav points to the node to be deleted

		if (trav == head && trav == tail) {
			// Only one node in the list
			head = tail = null;
		} else if (trav == head) {
			// Node to be deleted is the head
			head = trav.next;
			head.prev = null;
		} else if (trav == tail) {
			// Node to be deleted is the tail
			tail = trav.prev;
			tail.next = null;
		} else {
			// Node to be deleted is somewhere in between
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}

		// Decrease the size of the list
	        size--;
	}

	// delete by pos
	public void delByPos(int pos) {
		Node trav = head;
		int travpos = 0;
		if (head == null)
			System.out.println("List is empty");
		else if (pos == 0) {
			head = head.next;
		} else {
			while (trav != null && travpos < pos - 1) {
				trav = trav.next;
				travpos++;
			}
//			System.out.println("trav : "+trav.data);
			trav.next = trav.next.next;
			trav.next.next.prev = trav;
		}
	}

//	// delete by value
	public boolean delByValue(int key) {
		if (head == null) {
			System.out.println("Linked list is empty");
			return false;
		}
		else {
			Node trav = head;
//			int travpos = 0;
			while (trav.next != null) {
//				System.out.println(trav.data + " " + key);
				if (trav.data == key) {
					trav.next = trav.next.next;
					trav.next.next.prev = trav;
					return true;
				}
				trav = trav.next;
//				travpos++;
			}
		}
		return true;
	}

	// print list
	public void printList() {
		if (head == null)
			System.out.println("List is empty");
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println();
	}
}
