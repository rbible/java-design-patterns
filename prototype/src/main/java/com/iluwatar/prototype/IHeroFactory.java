package com.iluwatar.prototype;

/**
 * 
 * Interface for the factory class.
 * 
 */
public interface IHeroFactory {

	AbsMage createMage();

	AbsWarlord createWarlord();

	AbsBeast createBeast();

}
