package com.list;

public class DetectLoop {

	public static void main(String[] args) {
		int[] list1 = { 1, 6, 7, 9, -1, 3};
		
		System.out.println("List 1 is --> ");
		Node h1 = createList(list1);
		System.out.println(containsLoop(h1) ? "It contains Loop" : "Does not contain Loop");
		
		Node h2 = createLoopedList();
		System.out.println(containsLoop(h2) ? "List 2 contains Loop" : "List 2 Does not contain Loop");
		
		// Followup: Return the node where loop starts;
		Node result = getStartOfLoopNode(h2);
		System.out.println("Start of loop is --> " + result.data);
	}
	
	private static Node getStartOfLoopNode(Node h) {
		Node slow = h;
		Node fast = h;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) 
				break;
		}
		
		slow = h;
		
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
	}

	private static Node createLoopedList() {
		SLL list = new SLL();
		Node n1 = new Node(5);
		Node n2 = new Node(1);
		n2.next=n1;
		
		list.add(new Node(3));
		list.add(new Node(4));
		list.add(n1);
		list.add(new Node(2));
		list.add(new Node(-1));
		list.add(n2);
		
		//list.print();
		return list.getHead();
	}

	private static Node createList(int[] arr) {
		SLL list = new SLL();
		
		for(Integer i : arr) 
			list.add(new Node(i));

		list.print();
		return list.getHead();
	}

	private static boolean containsLoop(Node h) {
		Node slow = h;
		Node fast = h.next.next;
		
		while(slow != null) {
			if(slow == fast)	// If there is loop
				return true;
			if(fast == null) 	// If there is no loop
				return false;
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}

}
