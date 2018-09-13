package com.iluwatar.prototype;

public class ElfWarlord extends AbsWarlord {

	public ElfWarlord() {
	}

	public ElfWarlord(ElfWarlord warlord) {
	}

	@Override
	public AbsWarlord clone() throws CloneNotSupportedException {
		return new ElfWarlord(this);
	}

	@Override
	public String toString() {
		return "Elven warlord";
	}

}
