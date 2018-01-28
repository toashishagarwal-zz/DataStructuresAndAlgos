package com.list;

public class MiddleOfSLL {

	public static void main(String[] args) {
		SLL list = new SLL();
		list.add(new Node(3));
		list.add(new Node(3));
		list.add(new Node(-1));
		list.add(new Node(2));
		list.add(new Node(-1));
		list.add(new Node(1));

		list.print();
		
		Node n = findMiddleNode(list.getHead());
		System.out.println("Answer is --> " + n.data);
	}

	private static Node findMiddleNode(Node head) {
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next !=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
