package com.iluwatar.builder;

public enum EArmor {

    CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

    private String title;

    EArmor(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
