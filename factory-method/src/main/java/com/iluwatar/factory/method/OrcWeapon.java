package com.iluwatar.factory.method;

public class OrcWeapon implements IWeapon {

	private EWeaponType weaponType;

	public OrcWeapon(EWeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Orcish " + weaponType;
	}

}
