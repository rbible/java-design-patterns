package com.iluwatar.adapter.middleservice;

import com.iluwatar.adapter.itfc.IEngineer;
import com.iluwatar.adapter.service.GoblinGlider;

/**
 * 
 * Adapter class. Adapts the interface of the device (GoblinGlider) into
 * Engineer interface expected by the client (GnomeEngineeringManager).
 * 
 */
public class GnomeEngineer implements IEngineer {

    private GoblinGlider glider;

    public GnomeEngineer() {
        glider = new GoblinGlider();
    }

    @Override
    public void operateDevice() {
        glider.attachGlider();
        glider.gainSpeed();
        glider.takeOff();
    }
}
