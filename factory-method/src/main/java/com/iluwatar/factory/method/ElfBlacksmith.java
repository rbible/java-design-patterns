package com.iluwatar.factory.method;

/**
 * 
 * Concrete subclass for creating new objects.
 * 
 */
public class ElfBlacksmith implements IBlacksmith {

	public IWeapon manufactureWeapon(EWeaponType weaponType) {
		return new ElfWeapon(weaponType);
	}

}
