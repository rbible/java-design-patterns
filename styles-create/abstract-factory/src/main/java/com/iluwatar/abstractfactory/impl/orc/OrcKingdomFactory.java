package com.iluwatar.abstractfactory.impl.orc;

import com.iluwatar.abstractfactory.infc.IArmy;
import com.iluwatar.abstractfactory.infc.ICastle;
import com.iluwatar.abstractfactory.infc.IKing;
import com.iluwatar.abstractfactory.infc.IKingdomFactory;

/**
 * 
 * Concrete factory.
 * 
 */
public class OrcKingdomFactory implements IKingdomFactory {

	public ICastle createCastle() {
		return new OrcCastle();
	}

	public IKing createKing() {
		return new OrcKing();
	}

	public IArmy createArmy() {
		return new OrcArmy();
	}

}
