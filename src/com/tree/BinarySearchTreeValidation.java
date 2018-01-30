package com.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, validate if its a BST
 * 
 * @author ashish
 *
 */

public class BinarySearchTreeValidation {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(BinaryTreeNode.create(7));
		bst.add(BinaryTreeNode.create(3));
		bst.add(BinaryTreeNode.create(2));
		bst.add(BinaryTreeNode.create(5));
		bst.add(BinaryTreeNode.create(6));
		bst.add(BinaryTreeNode.create(8));
		
		System.out.println(isBST(bst.getRoot()));
		
		System.out.println(isBSTapproach2(bst.getRoot()));
	}

	/** **************** Approach 1 : Prefer not to use **************************/
	/** Use inorder traversal to sort the elements and then check 
	 *  the elements are sorted or not 
	 *  This method takes extra space for the array. Hence is not optimized */
	
	private static boolean isBST(BinaryTreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		inorder(root, list);
		Integer[] result = new Integer[list.size()];
		result = list.toArray(result);
		for(int i=1; i< result.length;i++) {
			if(result[i] < result[i-1]){
				return false;
			}
		}
		return true;
	}

	private static void inorder(BinaryTreeNode root, List<Integer> list) {
		if(root == null){
			return;
		}
		
		inorder(root.left, list);
		list.add(root.data);
		inorder(root.right, list);
	}
	 
	/******************** Approach 2: using the BST property ************************/
	private static boolean isBSTapproach2(BinaryTreeNode root) {
		return checkBST(root, null, null);
	}

	private static boolean checkBST(BinaryTreeNode root, Integer min, Integer max) {
		if(root == null) 
			return true;
		
		if((min != null && root.data <= min) || (max != null && root.data > max))
			return false;
		
		if(!checkBST(root.left, min, root.data) || !checkBST(root.right, root.data, max))
			return false;
		
		return true;
	}
	
}
