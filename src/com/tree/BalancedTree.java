package com.tree;

/**
 * Implement a function to see if a binary tree is balanced.
 * A tree is said to be balanced if the heights of the 2 subtrees of any node
 * never differ by more than one.
 * 
 * @author ashish
 *
 */

public class BalancedTree {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(BinaryTreeNode.create(7));
		bst.add(BinaryTreeNode.create(3));
		bst.add(BinaryTreeNode.create(2));
		bst.add(BinaryTreeNode.create(5));
		bst.add(BinaryTreeNode.create(6));
		bst.add(BinaryTreeNode.create(8));
		
		BinaryTreeNode root = bst.getRoot();
		System.out.println("By Approach 1 --> " +isBalanced(root));
		
		System.out.println("By Approach 2 --> " + isBalancedApproach2(root));
	}
	
	/****** APPROACH 1: checking balancedness while calculating height ********/
	
	private static boolean isBalanced(BinaryTreeNode root) {
		return checkHeight(root) != Integer.MIN_VALUE; 
	}

	/**
	 *   This is the desired algo. 
	 *   Time Complexity = O (n) 
	 */
	private static int checkHeight(BinaryTreeNode root) {
		if(root == null) return -1;
		
		int leftHt = checkHeight(root.left);
		if(leftHt == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		int rightHt = checkHeight(root.right);
		if(rightHt == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		int diff = leftHt - rightHt;
		if(Math.abs(diff) > 1)
			return Integer.MIN_VALUE;
		else 
			return Math.max(leftHt, rightHt) + 1;
	}
	
	/****** APPROACH 2: using height() function on every node ********/
	
	public static int height(BinaryTreeNode root) {
		if(root == null)
			return -1;
		return 1 + Math.max(height(root.left), height(root.right));
	}
	
	/** 
	 *  ******* DO NOT USE THIS APPROACH *******
	 *  Its highly inefficient and traverses all the nodes multiple times
	 *  Time Complexity = O(n log n)
	 *  Use the approach 1 
	 */
	public static boolean isBalancedApproach2(BinaryTreeNode root) {
		if(root == null) 
			return true;
		
		int leftHt = height(root.left);
		int rightHt = new BinarySearchTree().height(root.right);
		
		if(Math.abs(leftHt - rightHt) > 1)
			return false;
		else
			return isBalancedApproach2(root.left) && isBalancedApproach2(root.right);
	}
	
}
