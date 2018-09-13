package com.iluwatar.strategy;

/**
 * 
 * Spell strategy.
 *
 */
public class SpellStrategy implements IDragonSlayingStrategy {

	@Override
	public void execute() {
		System.out
				.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
	}

}
