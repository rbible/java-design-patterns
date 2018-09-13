package com.iluwatar.strategy;

/**
 * 
 * Projectile strategy.
 *
 */
public class ProjectileStrategy implements IDragonSlayingStrategy {

	@Override
	public void execute() {
		System.out
				.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
	}

}
