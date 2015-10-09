package com.iluwatar.visitor.visitor;

import com.iluwatar.visitor.unit.Commander;
import com.iluwatar.visitor.unit.Sergeant;
import com.iluwatar.visitor.unit.Soldier;

/**
 * 
 * CommanderVisitor
 *
 */
public class CommanderVisitor implements IUnitVisitor {

	@Override
	public void visitSoldier(Soldier soldier) {
	}

	@Override
	public void visitSergeant(Sergeant sergeant) {
	}

	@Override
	public void visitCommander(Commander commander) {
		System.out.println("Good to see you " + commander);
	}

}
