package com.iluwatar.memento;

public enum EStarType {

	SUN("sun"), RED_GIANT("red giant"), WHITE_DWARF("white dwarf"), SUPERNOVA("supernova"), DEAD("dead star"), UNDEFINED("");

    private String title;

    EStarType(String title) {
        this.title = title;
    }

    @Override
	public String toString() {
		return title;
	}
}
