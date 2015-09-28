package com.iluwatar.adapter.middleservice;

import com.iluwatar.adapter.itfc.IEngineer;

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
