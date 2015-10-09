package com.iluwatar.visitor.unit;

import com.iluwatar.visitor.visitor.IUnitVisitor;

/**
 * 
 * Sergeant
 *
 */
public class Sergeant extends AbsUnit {

	public Sergeant(AbsUnit... children) {
		super(children);
	}

	@Override
	public void accept(IUnitVisitor visitor) {
		visitor.visitSergeant(this);
		super.accept(visitor);
	}

	@Override
	public String toString() {
		return "sergeant";
	}
}
