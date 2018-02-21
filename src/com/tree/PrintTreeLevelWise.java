package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeLevelWise {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(BinaryTreeNode.create(7));
		bst.add(BinaryTreeNode.create(3));
		bst.add(BinaryTreeNode.create(2));
		bst.add(BinaryTreeNode.create(5));
		bst.add(BinaryTreeNode.create(6));
		bst.add(BinaryTreeNode.create(8));
		
		BinaryTreeNode root = bst.getRoot();
		
		printLevelWise(root);
	}

	private static void printLevelWise(BinaryTreeNode root) {
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		
		while(!q.isEmpty()) {
			BinaryTreeNode temp = q.remove();
			System.out.println(temp.data);
			
			if(temp.left != null)
				q.add(temp.left);
			
			if(temp.right != null)
				q.add(temp.right);
		}
	}
}
