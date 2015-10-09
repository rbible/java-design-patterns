package com.iluwatar.model.view.controller;

import com.iluwatar.model.view.controller.enums.EFatigue;
import com.iluwatar.model.view.controller.enums.EHealth;
import com.iluwatar.model.view.controller.enums.ENourishment;

/**
 * 
 * GiantController can update the giant data and redraw it using the view.
 *
 */
public class GiantController {

	private GiantModel giant;
	private GiantView view;

	public GiantController(GiantModel giant, GiantView view) {
		this.giant = giant;
		this.view = view;
	}
	
	public EHealth getHealth() {
		return giant.getHealth();
	}

	public void setHealth(EHealth health) {
		this.giant.setHealth(health);
	}

	public EFatigue getFatigue() {
		return giant.getFatigue();
	}

	public void setFatigue(EFatigue fatigue) {
		this.giant.setFatigue(fatigue);
	}

	public ENourishment getNourishment() {
		return giant.getNourishment();
	}

	public void setNourishment(ENourishment nourishment) {
		this.giant.setNourishment(nourishment);
	}
	
	public void updateView() {
		this.view.displayGiant(giant);
	}
}
