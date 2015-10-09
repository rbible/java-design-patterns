package com.iluwatar.prototype;

public class OrcBeast extends AbsBeast {

	public OrcBeast() {
	}

	public OrcBeast(OrcBeast beast) {
	}

	@Override
	public AbsBeast clone() throws CloneNotSupportedException {
		return new OrcBeast(this);
	}

	@Override
	public String toString() {
		return "Orcish wolf";
	}

}
