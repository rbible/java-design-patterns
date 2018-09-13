package com.iluwatar.builder;

import com.iluwatar.builder.Hero.HeroBuilder;

/**
 * 
 * This is the Builder pattern variation as described by Joshua Bloch in
 * Effective Java 2nd Edition.
 * 
 * We want to build Hero objects, but its construction is complex because of the
 * many parameters needed. To aid the user we introduce HeroBuilder class.
 * HeroBuilder takes the minimum parameters to build Hero object in its
 * constructor. After that additional configuration for the Hero object can be
 * done using the fluent HeroBuilder interface. When configuration is ready the
 * build method is called to receive the final Hero object.
 * 
 */
public class App {

    public static void main(String[] args) {

        Hero mage = new HeroBuilder(EProfession.MAGE, "Riobard").withHairColor(EHairColor.BLACK).withWeapon(EWeapon.DAGGER).build();
        System.out.println(mage);

        Hero warrior = new HeroBuilder(EProfession.WARRIOR, "Amberjill").withHairColor(EHairColor.BLOND)
                .withHairType(EHairType.LONG_CURLY).withArmor(EArmor.CHAIN_MAIL).withWeapon(EWeapon.SWORD).build();
        System.out.println(warrior);

        Hero thief = new HeroBuilder(EProfession.THIEF, "Desmond").withHairType(EHairType.BALD).withWeapon(EWeapon.BOW).build();
        System.out.println(thief);

    }
}
