package com.app.menudriven;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		try(Scanner sc = new Scanner(System.in)) {
			CircularLinkedList lst = new CircularLinkedList();
			boolean exit = false;
			
			while(!exit) {
				System.out.println("select option: \n"
						+ "1.insert at beginning\n"
						+ "2.insert at end \n"
						+ "3.Insert by position\n"
						+ "4.Delete by position\n"
						+ "5.Delete by value\n"
						+ "0.Exit");
				
				try {
					switch(sc.nextInt()) {
					case 1:
						//insert at beginning
						lst.insertAtBeg(5);
						lst.insertAtBeg(7);
						lst.display();
						break;
					case 2:
						//insert at end
						lst.insertAtEnd(3);
						lst.insertAtEnd(6);
						lst.display();
						break;
					case 3:
						//insert by position
						lst.insertByPos(0, 4);
						lst.display();
						break;
					case 4:
						//delete by pos
						
						break;
					case 0:
						exit = true;
						break;
					default:
						System.out.println("Invalid Option!");
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
