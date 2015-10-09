package com.iluwatar.factory.method;

public enum EWeaponType {

	SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

    private String title;

    EWeaponType(String title) {
        this.title = title;
    }

    @Override
	public String toString() {
		return title;
	}
}
