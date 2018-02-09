package com.tree;

public class CheckBST {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(BinaryTreeNode.create(7));
		bst.add(BinaryTreeNode.create(3));
		bst.add(BinaryTreeNode.create(2));
		bst.add(BinaryTreeNode.create(5));
		bst.add(BinaryTreeNode.create(6));
		bst.add(BinaryTreeNode.create(8));
		
		BinaryTreeNode root = bst.getRoot();
		System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		BinaryTreeNode root1 = createNonBST();
		System.out.println(isBST(root1, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	
	static BinaryTreeNode createNonBST() {
		BinaryTreeNode root = BinaryTreeNode.create(7);
		root.left = BinaryTreeNode.create(10);
		root.right = BinaryTreeNode.create(8);
		root.left.left = BinaryTreeNode.create(1);
		root.right.left = BinaryTreeNode.create(4);
		return root;
	}
	
	private static boolean isBST(BinaryTreeNode root, int left, int right) {
		if(root == null)
			return true;
		
		if(root.data < left || root.data > right){
			return false;
		}
		return isBST(root.left, left,root.data) 
				&& isBST(root.right, root.data, right);
	}
}
