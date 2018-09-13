package com.iluwatar.strategy;

/**
 * 
 * DragonSlayer uses different strategies to slay the dragon.
 * 
 */
public class DragonSlayer {

	private IDragonSlayingStrategy strategy;

	public DragonSlayer(IDragonSlayingStrategy strategy) {
		this.strategy = strategy;
	}

	public void changeStrategy(IDragonSlayingStrategy strategy) {
		this.strategy = strategy;
	}

	public void goToBattle() {
		strategy.execute();
	}
}
