package com.app.singlyLinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		
		//Insert at begining
		l1.insertAtBeg(5);
		l1.insertAtBeg(6);
		l1.insertAtBeg(2);
		l1.insertAtBeg(6);

		l1.printList();
//		
//		//Insert at end
//		l1.insertAtEnd(4);
//		l1.insertAtEnd(3);
//		l1.printList();
		
		l1.insertByPosition(3, 12);
		l1.printList();
		
		l1.deleteByPos(2);
		l1.printList();
		
	}

}
