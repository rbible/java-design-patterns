package com.iluwatar.event.aggregator;

/**
 * 
 * LordBaelish produces events.
 *
 */
public class LordBaelish extends AbsEventEmitter {
	
	public LordBaelish() {
		super();
	}

	public LordBaelish(IEventObserver obs) {
		super(obs);
	}
	
	@Override
	public void timePasses(Weekday day) {
		if (day.equals(Weekday.FRIDAY)) {
			notifyObservers(EEvent.STARK_SIGHTED);
		}
	}
}
