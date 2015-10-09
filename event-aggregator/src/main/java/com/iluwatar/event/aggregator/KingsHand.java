package com.iluwatar.event.aggregator;

/**
 * 
 * KingsHand observes events from multiple sources and delivers them
 * to listeners.
 *
 */
public class KingsHand extends AbsEventEmitter implements IEventObserver {

	public KingsHand() {
		super();
	}

	public KingsHand(IEventObserver obs) {
		super(obs);
	}
	
	@Override
	public void onEvent(EEvent e) {
		notifyObservers(e);
	}

	@Override
	public void timePasses(Weekday day) {
		// NOP
	}
}
