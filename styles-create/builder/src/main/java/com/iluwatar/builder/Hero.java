package com.iluwatar.builder;

/**
 * The class with many parameters.
 */
public class Hero {

    private final EProfession profession;
    private final String name;
    private final EHairType hairType;
    private final EHairColor hairColor;
    private final EArmor armor;
    private final EWeapon weapon;

    public EProfession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public EHairType getHairType() {
        return hairType;
    }

    public EHairColor getHairColor() {
        return hairColor;
    }

    public EArmor getArmor() {
        return armor;
    }

    public EWeapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("This is a ");
        sb.append(profession);
        sb.append(" named ");
        sb.append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor);
                sb.append(" ");
            }
            if (hairType != null) {
                sb.append(hairType);
                sb.append(" ");
            }
            sb.append(hairType != EHairType.BALD ? "hair" : "head");
        }
        if (armor != null) {
            sb.append(" wearing ");
            sb.append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ");
            sb.append(weapon);
        }
        sb.append(".");
        return sb.toString();
    }

    private Hero(HeroBuilder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    /**
     * 
     * The builder class.
     * 
     */
    public static class HeroBuilder {

        private final EProfession profession;
        private final String name;
        private EHairType hairType;
        private EHairColor hairColor;
        private EArmor armor;
        private EWeapon weapon;

        public HeroBuilder(EProfession profession, String name) {
            if (profession == null || name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public HeroBuilder withHairType(EHairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public HeroBuilder withHairColor(EHairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public HeroBuilder withArmor(EArmor armor) {
            this.armor = armor;
            return this;
        }

        public HeroBuilder withWeapon(EWeapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
