package com.iluwatar.event.aggregator;

/**
 * 
 * Observers of events implement this interface.
 *
 */
public interface IEventObserver {
	
	void onEvent(EEvent e);

}
