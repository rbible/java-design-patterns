package com.iluwatar.builder;

public enum EWeapon {

    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
