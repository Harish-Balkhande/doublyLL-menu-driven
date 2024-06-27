package com.app.doublyLL;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			DoublyLL lst = new DoublyLL();
			try {
				boolean exit = false;
				while (!exit) {
					System.out.println("menus :\n"
							+ "1.Add at Beginning \n"
							+ "2.Add At Last \n"
							+ "3.At At Index \n"
							+ "4.Delete First \n"
							+ "5.Delete Last \n"
							+ "6.Delete by position \n"
							+ "7.Delete by value \n"
							+ "8.Delete duplicate \n"
							+ "9.Search by value \n"
							+ "10.Update by value \n"
							+ "11.Min \n"
							+ "12.Max \n"
							+ "13.Sort");
					switch (sc.nextInt()) {
					case 1:
						// insert first
						lst.addFirst(5);
						lst.addFirst(8);
						lst.display();
						break;
					case 2:
						//add last
						lst.addLast(7);
						lst.addLast(3);
						lst.addLast(5);
						lst.addLast(7);
						lst.display();
						break;
					case 3:
						//add by position
						lst.insertByPos(0, 9);
						lst.insertByPos(2, 4);
						lst.insertByPos(6, 2);
						lst.display();
						break;
					case 4:
						//delete first
						lst.deleteFirst();
						lst.display();
						break;
					case 5:
						//delete last
						lst.deleteLast();
						lst.display();
						break;
					case 6:
						//delete by pos
						lst.deleteByPos(2);
						lst.deleteByPos(0);
						lst.display();
						break;
					case 7:
						//delete by value
						lst.delByValue(9);
						lst.display();
						break;
					case 8:
						//delete duplicate
						lst.deleteDuplicate();
						lst.display();
						break;
					case 9:
						//search by value
						lst.searchByValue(7);						
						break;
					case 10:
						//update by value
						lst.updateByValue(3, 12);
						lst.display();
						break;
					case 11:
						//find min
						int m = lst.findMin();
						System.out.println("min = "+m);
						break;
					case 0:
						exit=true;
						break;
					default:
						System.out.println("Invalid option!");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
