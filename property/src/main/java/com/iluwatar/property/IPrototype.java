package com.iluwatar.property;

/**
 * Interface for prototype inheritance
 */
public interface IPrototype {

	public Integer get(EStats stat);
	public boolean has(EStats stat);
	public void set(EStats stat, Integer val);
	public void remove(EStats stat);
}
