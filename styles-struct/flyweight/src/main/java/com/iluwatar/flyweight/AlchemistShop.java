package com.iluwatar.flyweight;

import java.util.ArrayList;
import java.util.List;

import com.iluwatar.flyweight.enums.EPotionType;

/**
 * 
 * AlchemistShop holds potions on its shelves.
 * It uses PotionFactory to provide the potions.
 * 
 */
public class AlchemistShop {

	private List<IPotion> topShelf;
	private List<IPotion> bottomShelf;

	public AlchemistShop() {
		topShelf = new ArrayList<>();
		bottomShelf = new ArrayList<>();
		fillShelves();
	}

	private void fillShelves() {

		PotionFactory factory = new PotionFactory();

		topShelf.add(factory.createPotion(EPotionType.INVISIBILITY));
		topShelf.add(factory.createPotion(EPotionType.INVISIBILITY));
		topShelf.add(factory.createPotion(EPotionType.STRENGTH));
		topShelf.add(factory.createPotion(EPotionType.HEALING));
		topShelf.add(factory.createPotion(EPotionType.INVISIBILITY));
		topShelf.add(factory.createPotion(EPotionType.STRENGTH));
		topShelf.add(factory.createPotion(EPotionType.HEALING));
		topShelf.add(factory.createPotion(EPotionType.HEALING));

		bottomShelf.add(factory.createPotion(EPotionType.POISON));
		bottomShelf.add(factory.createPotion(EPotionType.POISON));
		bottomShelf.add(factory.createPotion(EPotionType.POISON));
		bottomShelf.add(factory.createPotion(EPotionType.HOLY_WATER));
		bottomShelf.add(factory.createPotion(EPotionType.HOLY_WATER));
	}

	public void enumerate() {

		System.out.println("Enumerating top shelf potions\n");

		for (IPotion p : topShelf) {
			p.drink();
		}

		System.out.println("\nEnumerating bottom shelf potions\n");

		for (IPotion p : bottomShelf) {
			p.drink();
		}
	}
}
