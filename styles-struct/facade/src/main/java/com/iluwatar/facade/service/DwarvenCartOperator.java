package com.iluwatar.facade.service;

/**
 * 
 * DwarvenCartOperator is one of the goldmine subsystems.
 *
 */
public class DwarvenCartOperator extends AbsDwarvenMineWorker {

	@Override
	public void work() {
		System.out.println(name() + " moves gold chunks out of the mine.");
	}

	@Override
	public String name() {
		return "Dwarf cart operator";
	}

}
