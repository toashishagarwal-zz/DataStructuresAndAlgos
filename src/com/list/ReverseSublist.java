package com.list;

import java.util.StringJoiner;

public class ReverseSublist {

	public static void main(String[] args) {
		int[] list1 = { 1, 6, 7, 9, 5, 10, 3};
		Node h1 = createList(list1);
		System.out.println("Created list is -- ");
		print(h1);
		
		int m=2;
		int n=4;
		Node h2 = reverseSublist(h1, m, n );
		System.out.println("Reversed sublist is -- ");
		print(h2);
	}
	
	private static Node reverseSublist(Node h1, int m, int n) {
		int ctr=1;
		Node prev=null, temp = h1;
		
		while(ctr<m) {
			ctr++;
			prev = temp;
			temp = temp.next;
		}
		
		Node sublistHead = reverse(temp, n-m+1);
		prev.next = sublistHead;
		
		return h1;
	}

	private static Node reverse(Node head, int n) {
		Node connect = head;
		Node curr = head, next=null;
		head = null;
		int ctr=0;
		
		while(curr != null) {
			if(ctr == n) {
				connect.next = next;
				break;
			}
			next = curr.next;
			curr.next = head;
			head = curr;
			curr = next;
			ctr++;
		}
		return head;	
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

}
