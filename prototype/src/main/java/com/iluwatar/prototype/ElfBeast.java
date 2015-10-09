package com.iluwatar.prototype;

public class ElfBeast extends AbsBeast {

	public ElfBeast() {
	}

	public ElfBeast(ElfBeast beast) {
	}

	@Override
	public AbsBeast clone() throws CloneNotSupportedException {
		return new ElfBeast(this);
	}

	@Override
	public String toString() {
		return "Elven eagle";
	}

}
