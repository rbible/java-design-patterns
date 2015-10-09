package com.iluwatar.observer.generic;

import com.iluwatar.observer.EWeatherType;

public class GWeather extends AbsObservable<GWeather, IRace, EWeatherType> {

    private EWeatherType currentWeather;

    public GWeather() {
        currentWeather = EWeatherType.SUNNY;
    }

    public void timePasses() {
        EWeatherType[] enumValues = EWeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to " + currentWeather + ".");
        notifyObservers(currentWeather);
    }
}
