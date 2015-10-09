package com.iluwatar.observer;

public enum EWeatherType {

	SUNNY, RAINY, WINDY, COLD;

	@Override
	public String toString() {
		return this.name().toLowerCase();
	}

}
