package com.iluwatar.model.view.controller;

import com.iluwatar.model.view.controller.enums.EFatigue;
import com.iluwatar.model.view.controller.enums.EHealth;
import com.iluwatar.model.view.controller.enums.ENourishment;

/**
 * 
 * GiantModel contains the giant data
 *
 */
public class GiantModel {
	
	private EHealth health;
	private EFatigue fatigue;
	private ENourishment nourishment;

	GiantModel(EHealth health, EFatigue fatigue, ENourishment nourishment) {
		this.health = health;
		this.fatigue = fatigue;
		this.nourishment = nourishment;	
	}

	public EHealth getHealth() {
		return health;
	}

	public void setHealth(EHealth health) {
		this.health = health;
	}

	public EFatigue getFatigue() {
		return fatigue;
	}

	public void setFatigue(EFatigue fatigue) {
		this.fatigue = fatigue;
	}

	public ENourishment getNourishment() {
		return nourishment;
	}

	public void setNourishment(ENourishment nourishment) {
		this.nourishment = nourishment;
	}
	
	@Override
	public String toString() {
		return String.format("The giant looks %s, %s and %s.", health, fatigue, nourishment);
	}
}
