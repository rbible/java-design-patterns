package com.iluwatar.visitor.unit;

import com.iluwatar.visitor.visitor.IUnitVisitor;

/**
 * 
 * Interface for the nodes in hierarchy.
 * 
 */
public abstract class AbsUnit {

	private AbsUnit[] children;

	public AbsUnit(AbsUnit... children) {
		this.children = children;
	}

	public void accept(IUnitVisitor visitor) {
		for (AbsUnit child : children) {
			child.accept(visitor);
		}
	}
}
