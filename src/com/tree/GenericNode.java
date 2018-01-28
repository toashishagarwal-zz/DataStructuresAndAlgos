package com.tree;

import java.util.ArrayList;
import java.util.List;

public class GenericNode {
	int value;
	boolean visited = false; 
	List<GenericNode> vertices = new ArrayList<GenericNode>();

	public GenericNode(int value) {
		super();
		this.value = value;
	}

	public void addVertex(GenericNode n) {
		vertices.add(n);
	}

	@Override
	public String toString() {
		return "GenericNode [value=" + value + ", visited=" + visited
				+ ", vertices=" + vertices + "]";
	}
}
