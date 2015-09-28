package com.iluwatar.bridge;

import com.iluwatar.bridge.service.BlindingMagicWeapon;
import com.iluwatar.bridge.service.FlyingMagicWeapon;
import com.iluwatar.bridge.service.SoulEatingMagicWeapon;
import com.iluwatar.bridge.service2.Excalibur;
import com.iluwatar.bridge.service2.Mjollnir;
import com.iluwatar.bridge.service2.Stormbringer;

/**
 * 
 * In Bridge pattern both abstraction (MagicWeapon) and implementation
 * (MagicWeaponImp) have their own class hierarchies. The interface of the
 * implementations can be changed without affecting the clients.
 * 
 */
public class App {

    public static void main(String[] args) {
        BlindingMagicWeapon blindingMagicWeapon = new BlindingMagicWeapon(new Excalibur());
        blindingMagicWeapon.wield();
        blindingMagicWeapon.blind();
        blindingMagicWeapon.swing();
        blindingMagicWeapon.unwield();

        FlyingMagicWeapon flyingMagicWeapon = new FlyingMagicWeapon(new Mjollnir());
        flyingMagicWeapon.wield();
        flyingMagicWeapon.fly();
        flyingMagicWeapon.swing();
        flyingMagicWeapon.unwield();

        SoulEatingMagicWeapon soulEatingMagicWeapon = new SoulEatingMagicWeapon(new Stormbringer());
        soulEatingMagicWeapon.wield();
        soulEatingMagicWeapon.swing();
        soulEatingMagicWeapon.eatSoul();
        soulEatingMagicWeapon.unwield();

    }
}
