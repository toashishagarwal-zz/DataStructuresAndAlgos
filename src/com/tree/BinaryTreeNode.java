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
}
