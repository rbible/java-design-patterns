package com.iluwatar.flyweight;

public class HealingPotion implements IPotion {

	@Override
	public void drink() {
		System.out.println("You feel healed. (Potion=" + System.identityHashCode(this) + ")");
	}

}
