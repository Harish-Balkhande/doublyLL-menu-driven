package com.app.circularLinkedList;

public class Main {

	public static void main(String[] args) {
		CircularLinkedList lst = new CircularLinkedList();
		
		lst.insertAtBeg(4);
		lst.insertAtBeg(1);
		lst.insertAtBeg(9);
		lst.printList();
		
		//insert at last
		lst.insertAtLast(7);
		lst.insertAtLast(2);
		lst.printList();
		
		
		//insert at given position
		lst.insertByPos(2, 5);
		lst.printList();
		
		//delete by given position
		lst.deleteByPos(7);
		lst.printList();
	}

}
