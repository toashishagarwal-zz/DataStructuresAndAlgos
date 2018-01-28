package com.list;

public class MergeSortedLists {
	public static void main(String[] args) {
		int[] list1 = { 1, 6, 7, 9};
		int[] list2 = {2, 5, 8};
		
		Node h1 = createList(list1);
		Node h2 = createList(list2);
		
		merge(h1, h2);
	}
	
	private static void merge(Node h1, Node h2) {
		SLL result = new SLL();
		
		while(h1 != null && h2 != null) {
			if(h1.data < h2.data) {
				result.add(new Node(h1.data));
				h1 = h1.next;
			} else {
				result.add(new Node(h2.data));
				h2 = h2.next;
			}
		}
		
		if(h1 == null) {
			while(h2 != null) {
				result.add(new Node(h2.data));
				h2 = h2.next;
			}
		}
		
		if(h2 == null) {
			while(h1 != null) {
				result.add(new Node(h1.data));
				h1 = h1.next;
			}
		}
		result.print();
	}
	
	private static Node createList(int[] arr) {
		SLL list = new SLL();
		
		for(Integer i : arr) 
			list.add(new Node(i));

		return list.getHead();
	}
}
