package com.iluwatar.model.view.controller.enums;

/**
 * 
 * Fatigue enumeration
 *
 */
public enum EFatigue {

	ALERT("alert"), TIRED("tired"), SLEEPING("sleeping");
	
	private String title;
	
	EFatigue(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}	
}
