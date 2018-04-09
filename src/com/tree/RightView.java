package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class RightView {

	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeNode.create(1);
		root.left = BinaryTreeNode.create(2);
		root.right = BinaryTreeNode.create(3);
		root.left.right = BinaryTreeNode.create(5);
		root.right.left = BinaryTreeNode.create(4);
		rightView(root);
	}

	private static void rightView(BinaryTreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		 
	    if(root == null) 
	    	return;
	 
	    LinkedList<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
	    queue.add(root);
	 
	    while(!queue.isEmpty()){
	        //get size here
	        int size = queue.size();
	 
	        for(int i=0; i<size; i++){
	        	BinaryTreeNode top = queue.remove();
	 
	            //the first element in the queue (right-most of the tree)
	            if(i==0){
	                result.add(top.data);
	            }
	            //add right first
	            if(top.right != null){
	                queue.add(top.right);
	            }
	            //add left
	            if(top.left != null){
	                queue.add(top.left);
	            }
	        }
	    }
	 
	    System.out.println(result);
	}

}
