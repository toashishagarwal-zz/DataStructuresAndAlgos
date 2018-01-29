package com.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListOfDepths {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(BinaryTreeNode.create(7));
		bst.add(BinaryTreeNode.create(3));
		bst.add(BinaryTreeNode.create(2));
		bst.add(BinaryTreeNode.create(5));
		bst.add(BinaryTreeNode.create(6));
		bst.add(BinaryTreeNode.create(8));
		
		BinaryTreeNode root = bst.getRoot();
				
		List<LinkedList<BinaryTreeNode>> lists = createListOfLevels(root);
		System.out.println("Total LL are --" + lists.size());
		for(int i=0;i<lists.size();i++) {
			LinkedList<BinaryTreeNode> l = lists.get(i);
			System.out.println(Arrays.toString(l.toArray()));
		}
	}
	
	private static List<LinkedList<BinaryTreeNode>> createListOfLevels(BinaryTreeNode root) {
		List<LinkedList<BinaryTreeNode>> result = new ArrayList<LinkedList<BinaryTreeNode>>();
		
		int level = 0;
		LinkedList<BinaryTreeNode> list = new LinkedList<BinaryTreeNode>();
		list.add(root);
		result.add(level, list);
		
		while(true) {
			list = new LinkedList<BinaryTreeNode>();
			for(int i=0;i<result.get(level).size();i++) {
				BinaryTreeNode n = result.get(level).get(i);
				if(n != null) {
					if(n.left != null)
						list.add(n.left);
					if(n.right != null)
						list.add(n.right);
				}
			}
			if(list.size() > 0)
				result.add(level + 1, list);
			else
				break;
			level++;
		}
		return result;
	}

}
