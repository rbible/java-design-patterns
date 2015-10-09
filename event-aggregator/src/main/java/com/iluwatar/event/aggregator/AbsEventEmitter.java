package com.iluwatar.event.aggregator;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * EventEmitter is the base class for event producers that can be observed.
 *
 */
public abstract class AbsEventEmitter {

	private List<IEventObserver> observers;

	public AbsEventEmitter() {
		observers = new LinkedList<>();
	}

	public AbsEventEmitter(IEventObserver obs) {
		this();
		registerObserver(obs);
	}
	
	public void registerObserver(IEventObserver obs) {
		observers.add(obs);
	}
	
	protected void notifyObservers(EEvent e) {
		for (IEventObserver obs: observers) {
			obs.onEvent(e);
		}
	}
	
	public abstract void timePasses(Weekday day);
}
