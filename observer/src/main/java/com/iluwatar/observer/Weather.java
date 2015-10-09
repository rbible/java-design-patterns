package com.iluwatar.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Weather can be observed by implementing WeatherObserver interface and
 * registering as listener.
 * 
 */
public class Weather {

	private EWeatherType currentWeather;
	private List<IWeatherObserver> observers;

	public Weather() {
		observers = new ArrayList<>();
		currentWeather = EWeatherType.SUNNY;
	}

	public void addObserver(IWeatherObserver obs) {
		observers.add(obs);
	}

	public void removeObserver(IWeatherObserver obs) {
		observers.remove(obs);
	}

	public void timePasses() {
		EWeatherType[] enumValues = EWeatherType.values();
		currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
		System.out.println("The weather changed to " + currentWeather + ".");
		notifyObservers();
	}

	private void notifyObservers() {
		for (IWeatherObserver obs : observers) {
			obs.update(currentWeather);
		}
	}
}
