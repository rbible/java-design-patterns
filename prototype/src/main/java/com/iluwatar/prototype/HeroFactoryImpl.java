package com.iluwatar.prototype;

/**
 * 
 * Concrete factory class.
 * 
 */
public class HeroFactoryImpl implements IHeroFactory {

	private AbsMage mage;
	private AbsWarlord warlord;
	private AbsBeast beast;

	public HeroFactoryImpl(AbsMage mage, AbsWarlord warlord, AbsBeast beast) {
		this.mage = mage;
		this.warlord = warlord;
		this.beast = beast;
	}

	public AbsMage createMage() {
		try {
			return mage.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public AbsWarlord createWarlord() {
		try {
			return warlord.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public AbsBeast createBeast() {
		try {
			return beast.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
