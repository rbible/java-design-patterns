package com.iluwatar.abstractfactory.impl.elf;

import com.iluwatar.abstractfactory.infc.IArmy;
import com.iluwatar.abstractfactory.infc.ICastle;
import com.iluwatar.abstractfactory.infc.IKing;
import com.iluwatar.abstractfactory.infc.IKingdomFactory;

/**
 *
 * 抽象工厂
 * Concrete factory.
 * 
 */
public class ElfKingdomFactory implements IKingdomFactory {

	public ICastle createCastle() {
		return new ElfCastle();
	}

	public IKing createKing() {
		return new ElfKing();
	}

	public IArmy createArmy() {
		return new ElfArmy();
	}

}
