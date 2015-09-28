package com.iluwatar.bridge.service;

import com.iluwatar.bridge.itfc2.IBlindingMagicWeaponImp;

public class BlindingMagicWeapon extends AbsMagicWeapon {

    public BlindingMagicWeapon(IBlindingMagicWeaponImp imp) {
        super(imp);
    }

    @Override
    public IBlindingMagicWeaponImp getImp() {
        return (IBlindingMagicWeaponImp) imp;
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

    public void blind() {
        getImp().blindImp();
    }
}
