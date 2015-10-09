package com.iluwatar.templatemethod;

/**
 * 
 * Halfling thief uses StealingMethod to steal.
 * 
 */
public class HalflingThief {

	private AbsStealingMethod method;

	public HalflingThief(AbsStealingMethod method) {
		this.method = method;
	}

	public void steal() {
		method.steal();
	}

	public void changeMethod(AbsStealingMethod method) {
		this.method = method;
	}
}
