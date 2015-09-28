package com.iluwatar.bridge.service;

import com.iluwatar.bridge.itfc2.IMagicWeaponImp;

/**
 * 
 * Abstraction interface.
 * 
 */
public abstract class AbsMagicWeapon {

    protected IMagicWeaponImp imp;

    public AbsMagicWeapon(IMagicWeaponImp imp) {
        this.imp = imp;
    }

    public IMagicWeaponImp getImp() {
        return imp;
    }

    public abstract void wield();

    public abstract void swing();

    public abstract void unwield();

}
