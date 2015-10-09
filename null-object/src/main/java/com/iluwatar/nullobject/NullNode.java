package com.iluwatar.nullobject;

/**
 * 
 * Null Object implementation for binary tree node.
 * 
 * Implemented as Singleton, since all the NullNodes are the same.
 *
 */
public class NullNode implements INode {

	private static NullNode instance = new NullNode();
	
	private NullNode() {
	}
	
	public static NullNode getInstance() {
		return instance;
	}
	
	@Override
	public int getTreeSize() {
		return 0;
	}

	@Override
	public INode getLeft() {
		return null;
	}

	@Override
	public INode getRight() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void walk() {
	}
}
