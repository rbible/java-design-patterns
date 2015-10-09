package com.iluwatar.iterator;

import java.util.ArrayList;
import java.util.List;

import com.iluwatar.iterator.enums.EItemType;

/**
 * 
 * Collection class.
 * 
 */
public class TreasureChest {

	private List<Item> items;

	public TreasureChest() {
		items = new ArrayList<>();
		items.add(new Item(EItemType.POTION, "Potion of courage"));
		items.add(new Item(EItemType.RING, "Ring of shadows"));
		items.add(new Item(EItemType.POTION, "Potion of wisdom"));
		items.add(new Item(EItemType.POTION, "Potion of blood"));
		items.add(new Item(EItemType.WEAPON, "Sword of silver +1"));
		items.add(new Item(EItemType.POTION, "Potion of rust"));
		items.add(new Item(EItemType.POTION, "Potion of healing"));
		items.add(new Item(EItemType.RING, "Ring of armor"));
		items.add(new Item(EItemType.WEAPON, "Steel halberd"));
		items.add(new Item(EItemType.WEAPON, "Dagger of poison"));
	}

	IItemIterator Iterator(EItemType type) {
		return new TreasureChestItemIterator(this, type);
	}

	public List<Item> getItems() {
		ArrayList<Item> list = new ArrayList<>();
		list.addAll(items);
		return list;
	}

}
