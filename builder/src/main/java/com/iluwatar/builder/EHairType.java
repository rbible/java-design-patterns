package com.iluwatar.builder;

public enum EHairType {

    BALD("bald"),

    SHORT("short"),

    CURLY("curly"),

    LONG_STRAIGHT("long straight"),

    LONG_CURLY("long curly");

    private String title;

    EHairType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
