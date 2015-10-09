package com.iluwatar.iterator;

import java.util.List;

import com.iluwatar.iterator.enums.EItemType;

public class TreasureChestItemIterator implements IItemIterator {

	private TreasureChest chest;
	private int idx;
	private EItemType type;

	public TreasureChestItemIterator(TreasureChest chest, EItemType type) {
		this.chest = chest;
		this.type = type;
		this.idx = -1;
	}

	@Override
	public boolean hasNext() {
		return findNextIdx() != -1;
	}

	@Override
	public Item next() {
		idx = findNextIdx();
		if (idx != -1) {
			return chest.getItems().get(idx);
		}
		return null;
	}

	private int findNextIdx() {

		List<Item> items = chest.getItems();
		boolean found = false;
		int tempIdx = idx;
		while (!found) {
			tempIdx++;
			if (tempIdx >= items.size()) {
				tempIdx = -1;
				break;
			}
			if (type.equals(EItemType.ANY)
					|| items.get(tempIdx).getType().equals(type)) {
				break;
			}
		}
		return tempIdx;
	}
}
