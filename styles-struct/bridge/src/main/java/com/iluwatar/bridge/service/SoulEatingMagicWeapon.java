package com.iluwatar.bridge.service;

import com.iluwatar.bridge.itfc2.ISoulEatingMagicWeaponImp;

public class SoulEatingMagicWeapon extends AbsMagicWeapon {

    public SoulEatingMagicWeapon(ISoulEatingMagicWeaponImp imp) {
        super(imp);
    }

    @Override
    public ISoulEatingMagicWeaponImp getImp() {
        return (ISoulEatingMagicWeaponImp) imp;
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

    public void eatSoul() {
        getImp().eatSoulImp();
    }

}
