package com.iluwatar.prototype;

public class OrcMage extends AbsMage {

	public OrcMage() {
	}

	public OrcMage(OrcMage mage) {
	}

	@Override
	public AbsMage clone() throws CloneNotSupportedException {
		return new OrcMage(this);
	}

	@Override
	public String toString() {
		return "Orcish mage";
	}

}
