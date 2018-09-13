package com.iluwatar.iterator;

import com.iluwatar.iterator.enums.EItemType;

public class Item {

	private EItemType type;
	private String name;

	public Item(EItemType type, String name) {
		this.setType(type);
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public EItemType getType() {
		return type;
	}

	public void setType(EItemType type) {
		this.type = type;
	}
}
