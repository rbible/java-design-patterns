package com.iluwatar.event.aggregator;

/**
 * 
 * Event enumeration.
 *
 */
public enum EEvent {

	STARK_SIGHTED("Stark sighted"), WARSHIPS_APPROACHING("Warships approaching"), TRAITOR_DETECTED("Traitor detected");
	
	private String description;
	
	EEvent(String description) {
		this.description = description;	
	}
	
    public String toString() {
        return description;
    }
}
