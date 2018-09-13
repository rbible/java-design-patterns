package com.iluwatar.factory.method;

/**
 *
 * 工厂方法
 * Concrete subclass for creating new objects.
 * 
 */
public class ElfBlacksmith implements IBlacksmith {

	public IWeapon manufactureWeapon(EWeaponType weaponType) {
		return new ElfWeapon(weaponType);
	}

}
