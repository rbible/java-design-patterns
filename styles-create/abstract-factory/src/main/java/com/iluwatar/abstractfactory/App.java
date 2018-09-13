package com.iluwatar.abstractfactory;

import com.iluwatar.abstractfactory.impl.elf.ElfKingdomFactory;
import com.iluwatar.abstractfactory.impl.orc.OrcKingdomFactory;
import com.iluwatar.abstractfactory.infc.IArmy;
import com.iluwatar.abstractfactory.infc.ICastle;
import com.iluwatar.abstractfactory.infc.IKing;
import com.iluwatar.abstractfactory.infc.IKingdomFactory;

/**
 * 
 * The essence of the Abstract Factory pattern is a factory interface
 * (KingdomFactory) and its implementations (ElfKingdomFactory,
 * OrcKingdomFactory).
 * 
 * The example uses both concrete implementations to create a king, a castle and
 * an army.
 * 
 */
public class App {

	public static void main(String[] args) {
		createKingdom(new ElfKingdomFactory());
		createKingdom(new OrcKingdomFactory());
	}

	public static void createKingdom(IKingdomFactory factory) {
		IKing king = factory.createKing();
		ICastle castle = factory.createCastle();
		IArmy army = factory.createArmy();
		System.out.println("The kingdom was created.");
		System.out.println(king);
		System.out.println(castle);
		System.out.println(army);
		System.out.println();
	}
}
