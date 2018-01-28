package com.list;

public class KthNodeFromLast {

	public static void main(String[] args) {
		SLL list = new SLL();
		list.add(new Node(3));
		list.add(new Node(3));
		list.add(new Node(-1));
		list.add(new Node(2));
		list.add(new Node(-1));

		list.print();
		
		Node n = findKthNode(list.getHead(), 4);
		System.out.println("Answer is --> " + n.data);
	}

	private static Node findKthNode(Node head, int K) {
		Node back = head;
		Node curr = head;
		int count = 0;
		
		for(;count<K;count++)
			curr = curr.next;
		
		while(curr != null) {
			back = back.next;
			curr = curr.next;
		}
		
		return back;
	}

}
