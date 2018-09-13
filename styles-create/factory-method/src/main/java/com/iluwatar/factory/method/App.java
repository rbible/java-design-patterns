package com.iluwatar.factory.method;

/**
 * 
 * In Factory Method we have an interface (Blacksmith) with a method for
 * creating objects (manufactureWeapon). The concrete subclasses (OrcBlacksmith,
 * ElfBlacksmith) then override the method to produce objects of their liking.
 * 
 */
public class App {

	public static void main(String[] args) {
		IBlacksmith blacksmith;
		IWeapon weapon;

		blacksmith = new OrcBlacksmith();
		weapon = blacksmith.manufactureWeapon(EWeaponType.SPEAR);
		System.out.println(weapon);
		weapon = blacksmith.manufactureWeapon(EWeaponType.AXE);
		System.out.println(weapon);

		blacksmith = new ElfBlacksmith();
		weapon = blacksmith.manufactureWeapon(EWeaponType.SHORT_SWORD);
		System.out.println(weapon);
		weapon = blacksmith.manufactureWeapon(EWeaponType.SPEAR);
		System.out.println(weapon);
	}
}
