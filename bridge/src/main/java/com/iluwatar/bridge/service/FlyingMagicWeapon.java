package com.iluwatar.bridge.service;

import com.iluwatar.bridge.itfc2.IFlyingMagicWeaponImp;

public class FlyingMagicWeapon extends AbsMagicWeapon {

	public FlyingMagicWeapon(IFlyingMagicWeaponImp imp) {
		super(imp);
	}

	public IFlyingMagicWeaponImp getImp() {
		return (IFlyingMagicWeaponImp) imp;
	}

	@Override
	public void wield() {
		getImp().wieldImp();
	}

	@Override
	public void swing() {
		getImp().swingImp();
	}

	@Override
	public void unwield() {
		getImp().unwieldImp();
	}

	public void fly() {
		getImp().flyImp();
	}

}
