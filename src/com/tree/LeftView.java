package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeftView {

	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeNode.create(1);
		root.left = BinaryTreeNode.create(2);
		root.right = BinaryTreeNode.create(3);
		root.left.right = BinaryTreeNode.create(5);
		root.right.left = BinaryTreeNode.create(4);
		leftView(root);
	}

	private static void leftView(BinaryTreeNode root) {
		if(root == null) return;
		
		List<Integer> result = new ArrayList<Integer>();
		
		LinkedList<BinaryTreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			
			for(int i=0; i<size; i++) {
				BinaryTreeNode top = q.remove();
				
				if(i==0)
					result.add(top.data);
				
				if(top.left != null)
					q.add(top.left);
			
				if(top.right != null)
					q.add(top.right);
			}
		}
		System.out.println(result);
	}
}
