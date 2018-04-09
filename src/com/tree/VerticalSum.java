package com.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalSum {
	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeNode.create(1);
		root.left = BinaryTreeNode.create(2);
		root.right = BinaryTreeNode.create(3);
		root.left.left = BinaryTreeNode.create(4);
		root.left.right = BinaryTreeNode.create(5);
		root.right.left = BinaryTreeNode.create(6);
		root.right.left.right = BinaryTreeNode.create(8);
		root.right.right = BinaryTreeNode.create(7);
		root.right.right.right = BinaryTreeNode.create(9);
		vertical(root);
	}
	
	private static void vertical(BinaryTreeNode root) {
		HashMap<Integer, Integer> m = new HashMap<>();
		int hd=0;
		iterateVertical(m, hd, root);
		
		for(Map.Entry<Integer, Integer> e : m.entrySet())
			System.out.println(e.getKey() + "-" + e.getValue());
	}

	private static void iterateVertical(HashMap<Integer, Integer> m, int hd, BinaryTreeNode root) {
		if(root == null) return;
		
		Integer i = m.get(hd);
		
		if( i == null)
			m.put(hd, root.data);
		else 
			m.put(hd, m.get(hd) + root.data);
		
		iterateVertical(m, hd - 1, root.left);
		iterateVertical(m, hd + 1, root.right);
	}
}
