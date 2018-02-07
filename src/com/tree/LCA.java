package com.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Print the LCA of 2 nodes in a binary Tree
 * 
 * Please note: In this implementation for the sake of convenience
 * I have created a BST. But have not used the BST-property.
 * So the code applies to a normal binary tree also
 * 
 * @author ashish
 *
 */

public class LCA {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(BinaryTreeNode.create(7));
		bst.add(BinaryTreeNode.create(3));
		bst.add(BinaryTreeNode.create(2));
		bst.add(BinaryTreeNode.create(5));
		bst.add(BinaryTreeNode.create(6));
		bst.add(BinaryTreeNode.create(8));
		
		BinaryTreeNode root = bst.getRoot();
		System.out.println(getLCA(root, 2, 6));  // should print 3
		System.out.println(getLCA(root, 5, 6));  // should print 5
		System.out.println(getLCA(root, 6, 6));  // should print 6
		System.out.println(getLCA(root, 2, 8));  // should print 7
	}

	private static int getLCA(BinaryTreeNode root, int n1, int n2) {
		if(n1 == n2)
			return n1;
		
		List<Integer> path1 = new ArrayList<Integer>();
		getPath(root,n1, path1);
		
		List<Integer> path2 = new ArrayList<Integer>();
		getPath(root,n2, path2);
		
		Collections.reverse(path1);
		Collections.reverse(path2);
		
		int LCA=-1;
		if(path1.size() >= path2.size()){
			for(int i=0;i<path1.size()-1;i++) {
				if(path1.get(i) != path2.get(i)){
					return (LCA);
				}
				LCA=path1.get(i);
			}
		} else {
			for(int i=0;i<path2.size()-1;i++) {
				if(path1.get(i) != path2.get(i)){
					return (LCA);
				}
				LCA=path1.get(i);
			}
		}
		return LCA;
	}

	private static boolean getPath(BinaryTreeNode root, int value, List<Integer> path) {
		if(root == null)
			return false;
		
		if(root.data == value || getPath(root.left, value, path) || getPath(root.right, value, path)) {
			path.add(root.data);
			return true;
		}
		return false;
	}

}
