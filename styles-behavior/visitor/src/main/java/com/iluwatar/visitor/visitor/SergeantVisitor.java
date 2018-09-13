package com.iluwatar.visitor.visitor;

import com.iluwatar.visitor.unit.Commander;
import com.iluwatar.visitor.unit.Sergeant;
import com.iluwatar.visitor.unit.Soldier;

/**
 * 
 * SergeantVisitor
 *
 */
public class SergeantVisitor implements IUnitVisitor {

	@Override
	public void visitSoldier(Soldier soldier) {
	}

	@Override
	public void visitSergeant(Sergeant sergeant) {
		System.out.println("Hello " + sergeant);
	}

	@Override
	public void visitCommander(Commander commander) {
	}

}
