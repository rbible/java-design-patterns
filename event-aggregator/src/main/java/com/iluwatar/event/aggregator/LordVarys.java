package com.iluwatar.event.aggregator;

/**
 * 
 * LordVarys produces events.
 *
 */
public class LordVarys extends AbsEventEmitter {
	
	public LordVarys() {
		super();
	}

	public LordVarys(IEventObserver obs) {
		super(obs);
	}
	
	@Override
	public void timePasses(Weekday day) {
		if (day.equals(Weekday.SATURDAY)) {
			notifyObservers(EEvent.TRAITOR_DETECTED);
		}
	}
}
