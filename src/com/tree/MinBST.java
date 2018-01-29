package com.tree;

/**
 * Given a sort (in ascending) array, create a BST with min height
 * Logic: The tree will be of min height, if we make the center of array 
 * as the root. And then repeat the process for left-part and right-part recursively
 * @author ashish
 *
 */
public class MinBST {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		
		BinaryTreeNode root = createMinBST(a, 0, a.length-1);
		
		// Traverse and verify
		System.out.println("Preorder is --");
		BinaryTreeNode.preorder(root);
		System.out.println("Postorder is --");
		BinaryTreeNode.postorder(root);	
	}
	
	static BinaryTreeNode createMinBST(int[] a, int start, int end) {
		if(end < start) 
			return null;
		
		int mid = (start + end)/2;
		BinaryTreeNode n = BinaryTreeNode.create(a[mid]);
		n.left = createMinBST(a, start, mid -1);
		n.right = createMinBST(a, mid + 1, end);
		return n;
	}

}
