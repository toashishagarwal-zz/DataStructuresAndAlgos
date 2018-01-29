package com.tree;

public class BinaryTreeNode {
	public int data;
	public BinaryTreeNode left, right;
	
	private BinaryTreeNode(final int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public static BinaryTreeNode create(final int data) {
		return new BinaryTreeNode(data);
	}
	
	public static void inorder(BinaryTreeNode root) {
		if(root == null) return;
		
		inorder(root.left);
		System.out.println(root.data + " ");
		inorder(root.right);
	}
	
	public static void preorder(BinaryTreeNode root) {
		if(root == null) return;
		
		System.out.println(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(BinaryTreeNode root) {
		if(root == null) return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data + " ");
	}
	
	public String toString() {
		return this.data+" ";
	}
}
