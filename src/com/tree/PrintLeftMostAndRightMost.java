package com.tree;

import java.util.LinkedList;
import java.util.Queue;

/** for a given Binary Tree, print the left most and the right most nodes
 * 
 *  The idea is to use modified BFS where we use NULL to identify the change in levels
 * 
 * @author ashish
 *
 */

public class PrintLeftMostAndRightMost {
	static void printCorner(BinaryTreeNode root){
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
 
        q.add(root);
        q.add(null);
 
        // if isFirst = true then left most node of that level
        // will be printed
        boolean isFirst = false;
 
        // if isOne = true then that level has only one node
        boolean isOne = false;
 
        // last will store right most node of that level
        int last = 0;
 
        // Do level order traversal of Binary Tree
        while (!q.isEmpty()) {
            // dequeue the front node from the queue
        	BinaryTreeNode temp = q.peek();
            q.poll();
 
            // if isFirst is true, then temp is leftmost node
            if (isFirst) {
                System.out.print(temp.data + "  ");
 
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
                 
                // make isFirst as false and one = 1
                isFirst = false;
                isOne = true;
            } 
            // Else if temp is a separator between two levels
            else if (temp == null) {
                // Insert new separator if there are items in queue
                if (q.size() >= 1) 
                    q.add(null);
                 
                // making isFirst as true because next node will be
                // leftmost node of that level
                isFirst = true;
 
                // printing last node, only if that level
                // doesn't contain single node otherwise
                // that single node will be printed twice              
                if (!isOne)
                    System.out.print(last + "  ");    
            } 
            else {
                // Store current key as last
                last = temp.data;
 
                // Here we are making isOne = false to signify
                // that level has more than one node
                isOne = false;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);               
            }
        }
    }
 
    // Driver program to test above functions
    public static void main(String[] args) {
    	BinarySearchTree bst = new BinarySearchTree();
		bst.add(BinaryTreeNode.create(15));
		bst.add(BinaryTreeNode.create(20));
		bst.add(BinaryTreeNode.create(10));
		bst.add(BinaryTreeNode.create(12));
		bst.add(BinaryTreeNode.create(8));
		bst.add(BinaryTreeNode.create(16));
		bst.add(BinaryTreeNode.create(25));
 
        printCorner(bst.getRoot());
    }
}
