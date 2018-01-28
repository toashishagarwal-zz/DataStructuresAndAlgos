package com.list;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupesFromList {

	public static void main(String[] args) {
		SLL list = new SLL();
		list.add(new Node(3));
		list.add(new Node(3));
		list.add(new Node(-1));
		list.add(new Node(2));
		list.add(new Node(-1));

		list.print();
		
		removeDupes(list.getHead());
		list.print();
	}
	
	private static void removeDupes(Node head) {
		Set<Integer> set = new HashSet<Integer>();
		
		Node temp = head, prev=null;
		while(temp !=null) {
			if(set.add(temp.data)){
				prev = temp;
				temp = temp.next;
			} else {
				// delete
				prev.next = temp.next;
				temp = temp.next;
			}
		}
	}

}
