package com.iluwatar.model.view.controller.enums;

/**
 * 
 * Health enumeration
 *
 */
public enum EHealth {
	
	HEALTHY("healthy"), WOUNDED("wounded"), DEAD("dead");
	
	private String title;
	
	EHealth(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
