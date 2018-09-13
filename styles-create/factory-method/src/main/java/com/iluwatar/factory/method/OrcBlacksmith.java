package com.iluwatar.factory.method;

/**
 * 
 * Concrete subclass for creating new objects.
 * 
 */
public class OrcBlacksmith implements IBlacksmith {

	public IWeapon manufactureWeapon(EWeaponType weaponType) {
		return new OrcWeapon(weaponType);
	}

}
