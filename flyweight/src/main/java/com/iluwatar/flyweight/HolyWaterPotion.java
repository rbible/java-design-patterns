package com.iluwatar.flyweight;

public class HolyWaterPotion implements IPotion {

	@Override
	public void drink() {
		System.out.println("You feel blessed. (Potion=" + System.identityHashCode(this) + ")");
	}

}
