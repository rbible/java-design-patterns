package com.iluwatar.facade.service;

/**
 * 
 * DwarvenGoldDigger is one of the goldmine subsystems.
 *
 */
public class DwarvenGoldDigger extends AbsDwarvenMineWorker {

	@Override
	public void work() {
		System.out.println(name() + " digs for gold.");
	}

	@Override
	public String name() {
		return "Dwarf gold digger";
	}

}
