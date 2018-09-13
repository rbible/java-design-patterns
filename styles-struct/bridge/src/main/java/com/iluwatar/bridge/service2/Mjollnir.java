package com.iluwatar.bridge.service2;

import com.iluwatar.bridge.itfc2.IFlyingMagicWeaponImp;

public class Mjollnir implements IFlyingMagicWeaponImp {

    @Override
    public void wieldImp() {
        System.out.println("wielding Mjollnir");
    }

    @Override
    public void swingImp() {
        System.out.println("swinging Mjollnir");
    }

    @Override
    public void unwieldImp() {
        System.out.println("unwielding Mjollnir");
    }

    @Override
    public void flyImp() {
        System.out.println("Mjollnir hits the enemy in the air and returns back to the owner's hand");
    }

}
