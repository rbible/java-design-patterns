package com.iluwatar.nullobject;

/**
 * 
 * Implementation for binary tree's normal nodes.
 *
 */
public class NodeImpl implements INode {

	private final String name;
	private final INode left;
	private final INode right;
	
	public NodeImpl(String name, INode left, INode right) {
		this.name = name;
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int getTreeSize() {
		return 1 + left.getTreeSize() + right.getTreeSize();
	}

	@Override
	public INode getLeft() {
		return left;
	}

	@Override
	public INode getRight() {
		return right;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void walk() {
		System.out.println(name);
		if (left.getTreeSize() > 0) {
			left.walk();
		}
		if (right.getTreeSize() > 0) {
			right.walk();
		}
	}
}
