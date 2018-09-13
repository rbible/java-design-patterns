package com.iluwatar.visitor.unit;

import com.iluwatar.visitor.visitor.IUnitVisitor;

/**
 * 
 * Commander
 *
 */
public class Commander extends AbsUnit {

	public Commander(AbsUnit... children) {
		super(children);
	}

	@Override
	public void accept(IUnitVisitor visitor) {
		visitor.visitCommander(this);
		super.accept(visitor);
	}

	@Override
	public String toString() {
		return "commander";
	}
}
