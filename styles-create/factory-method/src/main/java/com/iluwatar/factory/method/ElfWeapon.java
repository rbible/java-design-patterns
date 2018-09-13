package com.iluwatar.factory.method;

public class ElfWeapon implements IWeapon {

	private EWeaponType weaponType;

	public ElfWeapon(EWeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Elven " + weaponType;
	}

}
