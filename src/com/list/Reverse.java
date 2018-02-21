package com.list;

import java.util.StringJoiner;

public class Reverse {

	public static void main(String[] args) {
		int[] list1 = { 1, 6, 7, 9, 5, -1, 3};
		Node h1 = createList(list1);
		System.out.println("Created list is -- ");
		print(h1);
		
		Node h = reverse(h1);
		System.out.println("Reversed list is -- ");
		print(h);
	}
	private static Node createList(int[] arr) {
		SLL list = new SLL();
		
		for(Integer i : arr) 
			list.add(new Node(i));

		return list.getHead();
	}
	
	private static void print(Node head) {
		Node curr = head;
		StringJoiner joiner = new StringJoiner(" -> ");
		while (curr != null) {
			joiner.add(curr.data+"");
			curr = curr.next;
		}
		System.out.println(joiner);
	}

	private static Node reverse(Node head) {
		Node curr = head, next=null;
		head = null;
		while(curr != null) {
			next = curr.next;
			curr.next = head;
			head = curr;
			curr = next;
		}
		return head;
	}
}
