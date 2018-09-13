package com.iluwatar.prototype;

public class OrcWarlord extends AbsWarlord {

	public OrcWarlord() {
	}

	public OrcWarlord(OrcWarlord warlord) {
	}

	@Override
	public AbsWarlord clone() throws CloneNotSupportedException {
		return new OrcWarlord(this);
	}

	@Override
	public String toString() {
		return "Orcish warlord";
	}

}
