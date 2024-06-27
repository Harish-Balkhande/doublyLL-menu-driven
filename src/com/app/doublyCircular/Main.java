package com.app.doublyCircular;

public class Main {

	public static void main(String[] args) {
		DoublyCircularLinkedList lst = new DoublyCircularLinkedList();
		
		lst.insertAtBeg(5);
		lst.insertAtBeg(4);
		lst.printList();
//		
		//insert at end
		lst.insertAtEnd(6);
		lst.insertAtEnd(2);
		lst.insertAtEnd(8);
		lst.printList();
		
		//insert by pos
//		lst.insertByPos(1, 7);
//		lst.printList();
//		
//		System.out.println("delete -------");
//		lst.delByPos(0);
//		lst.printList();
	}

}
