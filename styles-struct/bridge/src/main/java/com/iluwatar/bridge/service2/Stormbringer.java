package com.iluwatar.bridge.service2;

import com.iluwatar.bridge.itfc2.ISoulEatingMagicWeaponImp;

public class Stormbringer implements ISoulEatingMagicWeaponImp {

    @Override
    public void wieldImp() {
        System.out.println("wielding Stormbringer");
    }

    @Override
    public void swingImp() {
        System.out.println("swinging Stormbringer");
    }

    @Override
    public void unwieldImp() {
        System.out.println("unwielding Stormbringer");
    }

    @Override
    public void eatSoulImp() {
        System.out.println("Stormbringer devours the enemy's soul");
    }

}
