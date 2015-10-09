package com.iluwatar.model.view.controller.enums;

/**
 * 
 * Nourishment enumeration
 *
 */
public enum ENourishment {

	SATURATED("saturated"), HUNGRY("hungry"), STARVING("starving");
	
	private String title;
	
	ENourishment(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}	
}
