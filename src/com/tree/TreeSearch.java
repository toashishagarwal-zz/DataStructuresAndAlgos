package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeSearch {
	
	/**
	 * BFS searches the nodes level-wise and uses a Queue for implementation
	 * @param head
	 * @return
	 */
	public static List<Integer> bfsBinaryTree(BinaryTreeNode head) {
		if (head == null)
			return null;
		
		List<Integer> result = new ArrayList<Integer>();
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>() ;

		queue.add(head);
		while(!queue.isEmpty()){
			BinaryTreeNode node = queue.remove();
			result.add(node.data);
			if(node.left != null) 
				queue.add(node.left);
			if(node.right != null) 
				queue.add(node.right);
		}
		return result;
	}
	
	public static List<Integer> bfsTreeOrGraph(GenericNode head) {
		if (head == null)
			return null;
		
		List<Integer> result = new ArrayList<Integer>();
		Queue<GenericNode> q = new LinkedList<GenericNode>() ;
		
		q.add(head);
		while(!q.isEmpty()){
			GenericNode node = q.remove();
			node.visited = true;
			result.add(node.value);
			for(GenericNode v: node.vertices) {
				if(v.visited)
					continue;
				q.add(v);
			}
		}
		return result;
	}
}
