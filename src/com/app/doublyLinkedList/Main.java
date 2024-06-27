package com.app.doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList lst = new DoublyLinkedList();
		
		lst.addAtBeg(5);
		lst.addAtBeg(4);
		lst.printList();
		
		//add last
		lst.addLast(3);
		lst.printList();
		
		lst.insertByPos(1, 6);
		lst.printList();
		
		System.out.println("delete.....");
		//del by pos
		lst.delByPos(1);
		lst.printList();
		lst.delByPos(1);
//		lst.deleteAtIndex(1);
//		lst.deleteAtIndex(0);
		
//		//del by value
//		lst.delByValue(5);
		lst.printList();
	}

}
