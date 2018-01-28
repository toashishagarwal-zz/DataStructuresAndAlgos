package com.list;

public class SumLists {

	public static void main(String[] args) {
		int[] list1 = {7, 1, 6};
		int[] list2 = {5,9,2};
		
		Node h1 = createList(list1);
		Node h2 = createList(list2);
		
		sum(h1, h2);
	}

	private static void sum(Node h1, Node h2) {
		SLL result = new SLL();
		int carry=0, sum=0, val =0;
		while (h1 != null && h2 != null) {
			sum = h1.data + h2.data + carry;
			if(sum > 9){
				carry = sum / 10;
				val = sum % 10;
				result.add(new Node(val));
			} else {
				result.add(new Node(sum));
				carry = 0;
			}
			h1 = h1.next;
			h2 = h2.next;		
		}
		
		if(h1 == null) {
			while (h2 != null) {
				result.add(new Node(h2.data));
				h2 = h2.next;
			}
		}
		
		if(h2 == null) {
			while (h1 != null) {
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
