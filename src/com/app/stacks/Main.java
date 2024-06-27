package com.app.stacks;

public class Main {
	public static void main(String[] args) {
		Stack stk = new Stack(5);
		
		stk.push(4);
		stk.push(9);
		stk.push(2);
		stk.display();
		
		stk.pop();
		stk.display();
		
		System.out.println("LinkedList stack");
		LinkedListStack ls = new LinkedListStack();
		ls.push(5);
		ls.push(2);
		ls.push(7);
		ls.display();
		
		ls.pop();
		ls.display();
		
		ls.peek();
		ls.display();
	}
}
