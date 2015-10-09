package com.iluwatar.nullobject;

/**
 * 
 * Interface for binary tree node.
 *
 */
public interface INode {

	String getName();
	int getTreeSize();
	INode getLeft();
	INode getRight();
	void walk();
}
