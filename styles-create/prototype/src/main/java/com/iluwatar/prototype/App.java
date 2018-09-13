package com.iluwatar.prototype;

/**
 * 
 * In Prototype we have a factory class (HeroFactoryImpl) producing objects by
 * cloning existing ones. In this example the factory's prototype objects are
 * given as constructor parameters.
 * 
 */
public class App {

	public static void main(String[] args) {
		IHeroFactory factory;
		AbsMage mage;
		AbsWarlord warlord;
		AbsBeast beast;

		factory = new HeroFactoryImpl(new ElfMage(), new ElfWarlord(), new ElfBeast());
		mage = factory.createMage();
		warlord = factory.createWarlord();
		beast = factory.createBeast();
		System.out.println(mage);
		System.out.println(warlord);
		System.out.println(beast);

		factory = new HeroFactoryImpl(new OrcMage(), new OrcWarlord(), new OrcBeast());
		mage = factory.createMage();
		warlord = factory.createWarlord();
		beast = factory.createBeast();
		System.out.println(mage);
		System.out.println(warlord);
		System.out.println(beast);
	}
}
