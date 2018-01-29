package com.tree;

public class BinarySearchTree {
	private BinaryTreeNode root;
	
	public void add(BinaryTreeNode n) {
		BinaryTreeNode current = null;
		BinaryTreeNode prev=null;
		if(root == null) {
			root = n;
		} else {
			current = root;
			while (current != null) {
				prev = current;
				if(n.data < current.data) {
					current=current.left;
				} else 
					current=current.right;
			}
			
			if(n.data < prev.data)
				prev.left = n;
			else
				prev.right = n;
		}
	}
	
	public BinaryTreeNode getRoot(){
		return root;
	}

}
