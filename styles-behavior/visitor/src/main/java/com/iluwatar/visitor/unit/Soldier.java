package com.iluwatar.visitor.unit;

import com.iluwatar.visitor.visitor.IUnitVisitor;

/**
 * 
 * Soldier
 *
 */
public class Soldier extends AbsUnit {

	public Soldier(AbsUnit... children) {
		super(children);
	}

	@Override
	public void accept(IUnitVisitor visitor) {
		visitor.visitSoldier(this);
		super.accept(visitor);
	}

	@Override
	public String toString() {
		return "soldier";
	}
}
