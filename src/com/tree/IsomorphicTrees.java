package com.tree;

public class IsomorphicTrees {

	public static void main(String[] args) {

	}
	
	 boolean isIsomorphic(BinaryTreeNode n1, BinaryTreeNode n2) {
        // Both roots are NULL, trees isomorphic by definition
        if (n1 == null && n2 == null)
            return true;
  
        // Exactly one of the n1 and n2 is NULL, trees not isomorphic
        if (n1 == null || n2 == null)
            return false;
  
        if (n1.data != n2.data)
            return false;
  
        return (isIsomorphic(n1.left, n2.left) && isIsomorphic(n1.right, n2.right))
        		|| (isIsomorphic(n1.left, n2.right) && isIsomorphic(n1.right, n2.left));
       }
}
