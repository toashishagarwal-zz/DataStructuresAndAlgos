package com.tree;

public class BinaryTreePrinter {

	public static void inorder(BinaryTreeNode head) {
		if(head == null)
			return;
		else {
			inorder(head.left);
			System.out.println(head.data + " ");
			inorder(head.right);
		}
	}
	
	public static void preorder(BinaryTreeNode head) {
		if(head == null)
			return;
		else {
			System.out.println(head.data + " ");
			preorder(head.left);
			preorder(head.right);
		}
	}
}
