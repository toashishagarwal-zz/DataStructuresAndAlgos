package com.list;

import java.util.StringJoiner;

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SLL {
	
	private Node head;
	
	public void add(Node node) {
		if(head == null) {
			head = node;
		} else {
			Node curr = head;
			Node prev=null;
			while (curr != null) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = node;
		}
	}
	
	public void print() {
		Node curr = head;
		StringJoiner joiner = new StringJoiner(" -> ");
		while (curr != null) {
			joiner.add(""+curr.data);
			curr = curr.next;
		}
		System.out.println(joiner);
	}

	public Node getHead() {
		return head;
	}
}
