package com.tree;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreePathRootToNode {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(BinaryTreeNode.create(7));
		bst.add(BinaryTreeNode.create(3));
		
		BinaryTreeNode node = BinaryTreeNode.create(2);
		bst.add(node);
		bst.add(BinaryTreeNode.create(5));
		bst.add(BinaryTreeNode.create(6));
		bst.add(BinaryTreeNode.create(8));
		
		BinaryTreeNode root = bst.getRoot();
		pathToNode(root, node);
		Collections.reverse(list);
		for(Integer i:list)
			System.out.print(i+" ");
	}

	private static boolean pathToNode(BinaryTreeNode root, BinaryTreeNode node) {
		if(root == null)
			return false;
		if(root.data == node.data || pathToNode(root.left, node) || pathToNode(root.right, node)) {
			list.add(root.data);
			return true;
		}
		return false;
	}
}
