package com.iluwatar.prototype;

public class ElfMage extends AbsMage {

	public ElfMage() {
	}

	public ElfMage(ElfMage mage) {
	}

	@Override
	public AbsMage clone() throws CloneNotSupportedException {
		return new ElfMage(this);
	}

	@Override
	public String toString() {
		return "Elven mage";
	}

}
