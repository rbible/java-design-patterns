package com.iluwatar.event.aggregator;

/**
 * 
 * Scout produces events.
 *
 */
public class Scout extends AbsEventEmitter {
	
	public Scout() {
		super();
	}

	public Scout(IEventObserver obs) {
		super(obs);
	}
	
	@Override
	public void timePasses(Weekday day) {
		if (day.equals(Weekday.TUESDAY)) {
			notifyObservers(EEvent.WARSHIPS_APPROACHING);
		}
	}
}
