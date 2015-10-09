package com.iluwatar.event.aggregator;

/**
 * 
 * KingJoffrey observes events from KingsHand.
 *
 */
public class KingJoffrey implements IEventObserver {

	@Override
	public void onEvent(EEvent e) {
		System.out.println("Received event from the King's Hand: " + e.toString());
	}
}
