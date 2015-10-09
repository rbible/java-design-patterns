package com.iluwatar.facade.service;

/**
 * 
 * DwarvenTunnelDigger is one of the goldmine subsystems.
 *
 */
public class DwarvenTunnelDigger extends AbsDwarvenMineWorker {

	@Override
	public void work() {
		System.out.println(name() + " creates another promising tunnel.");
	}

	@Override
	public String name() {
		return "Dwarven tunnel digger";
	}

}
