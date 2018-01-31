package com.tree;

import java.util.ArrayList;
import java.util.List;

public class AllPathsBinaryTree {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(BinaryTreeNode.create(7));
		bst.add(BinaryTreeNode.create(3));
		bst.add(BinaryTreeNode.create(2));
		bst.add(BinaryTreeNode.create(5));
		bst.add(BinaryTreeNode.create(6));
		bst.add(BinaryTreeNode.create(8));
		
		BinaryTreeNode root = bst.getRoot();
		allPaths(root, new ArrayList<Integer>());
	}

	private static void allPaths(BinaryTreeNode node, List<Integer> path) {
		if(node==null) 
	        return;

		path.add(node.data);

	    if(node.left==null && node.right==null){
	        System.out.println(path);
	        return;
	    } else {
	    	allPaths(node.left,new ArrayList<Integer>(path));
	    	allPaths(node.right,new ArrayList<Integer>(path));
	    }      
	}
}
