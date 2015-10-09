package com.iluwatar.decorator;

/**
 * SmartTroll is a decorator for Hostile objects.
 * The calls to the Hostile interface are intercepted
 * and decorated. Finally the calls are delegated
 * to the decorated Hostile object.
 *
 */
public class SmartTroll implements IHostile {

	private IHostile decorated;

	public SmartTroll(IHostile decorated) {
		this.decorated = decorated;
	}

	@Override
	public void attack() {
		System.out.println("The troll throws a rock at you!");
		decorated.attack();
	}

	@Override
	public void fleeBattle() {
		System.out.println("The troll calls for help!");
		decorated.fleeBattle();
	}

}
