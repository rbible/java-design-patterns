package com.iluwatar.adapter;

/**
 * 
 * GnomeEngineering manager uses Engineer to operate devices.
 * 
 */
public class GnomeEngineeringManager implements IEngineer {

	private IEngineer engineer;

	public GnomeEngineeringManager() {
		engineer = new GnomeEngineer();
	}

	@Override
	public void operateDevice() {
		engineer.operateDevice();
	}
}
