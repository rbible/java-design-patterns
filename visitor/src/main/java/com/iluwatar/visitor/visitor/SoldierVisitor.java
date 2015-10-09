package com.iluwatar.visitor.visitor;

import com.iluwatar.visitor.unit.Commander;
import com.iluwatar.visitor.unit.Sergeant;
import com.iluwatar.visitor.unit.Soldier;

/**
 * 
 * SoldierVisitor
 *
 */
public class SoldierVisitor implements IUnitVisitor {

	@Override
	public void visitSoldier(Soldier soldier) {
		System.out.println("Greetings " + soldier);
	}

	@Override
	public void visitSergeant(Sergeant sergeant) {
	}

	@Override
	public void visitCommander(Commander commander) {
	}

}
