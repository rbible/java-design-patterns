package com.iluwatar.visitor.visitor;

import com.iluwatar.visitor.unit.Commander;
import com.iluwatar.visitor.unit.Sergeant;
import com.iluwatar.visitor.unit.Soldier;

/**
 * 
 * Visitor interface.
 * 
 */
public interface IUnitVisitor {

	void visitSoldier(Soldier soldier);

	void visitSergeant(Sergeant sergeant);

	void visitCommander(Commander commander);
}
