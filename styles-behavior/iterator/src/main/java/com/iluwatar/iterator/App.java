package com.iluwatar.iterator;

import com.iluwatar.iterator.enums.EItemType;

/**
 * 
 * Iterator (ItemIterator) adds abstraction layer on top of a collection
 * (TreasureChest). This way the collection can change its internal
 * implementation without affecting its clients.
 * 
 */
public class App {

	public static void main(String[] args) {
		TreasureChest chest = new TreasureChest();

		IItemIterator ringIterator = chest.Iterator(EItemType.RING);
		while (ringIterator.hasNext()) {
			System.out.println(ringIterator.next());
		}

		System.out.println("----------");

		IItemIterator potionIterator = chest.Iterator(EItemType.POTION);
		while (potionIterator.hasNext()) {
			System.out.println(potionIterator.next());
		}

		System.out.println("----------");

		IItemIterator weaponIterator = chest.Iterator(EItemType.WEAPON);
		while (weaponIterator.hasNext()) {
			System.out.println(weaponIterator.next());
		}

		System.out.println("----------");

		IItemIterator it = chest.Iterator(EItemType.ANY);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
