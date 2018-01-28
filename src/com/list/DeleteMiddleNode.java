package com.list;

/**
 * This program deletes the node in SLL given a reference to that node.
 * Please note you are NOT given a reference to the HEAD
 * @author ashish
 *
 */
public class DeleteMiddleNode {

	public static void main(String[] args) {
		Node n = new Node(2);
		SLL list = new SLL();
		list.add(new Node(3));
		list.add(new Node(3));
		list.add(new Node(-1));
		list.add(n);
		list.add(new Node(-1));
		list.add(new Node(1));

		list.print();
		
		System.out.println("After deleting node " + n.data + " :");
		deleteMiddleNode(n);	
		list.print();
	}

	private static void deleteMiddleNode(Node n) {
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
	}

}
