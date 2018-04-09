package com.list;

/**
 * Print a SLL in reverse order without reversing the list
 * 
 * @author ashish
 *
 */

public class PrintReverseList {

	public static void main(String[] args) {
		int[] list1 = { 1, 6, 7, 9, 5, -1, 3};
		Node h1 = createList(list1);
		printReverse(h1);
	}
	
	private static Node createList(int[] arr) {
		SLL list = new SLL();
		
		for(Integer i : arr) 
			list.add(new Node(i));

		return list.getHead();
	}
	
	private static void printReverse(Node head) {
		if(head == null)
			return;
		printReverse(head.next);
		System.out.print(head.data+" ");
	}
}
