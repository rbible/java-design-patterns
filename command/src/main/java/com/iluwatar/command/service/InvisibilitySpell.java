package com.iluwatar.command.service;

import com.iluwatar.command.target.EVisibility;
import com.iluwatar.command.target.Target;

/**
 * 
 * InvisibilitySpell is a concrete command
 *
 */
public class InvisibilitySpell implements ICommand {

    private Target target;

    @Override
    public void execute(Target target) {
        target.setVisibility(EVisibility.INVISIBLE);
        this.target = target;
    }

    @Override
    public void undo() {
        if (target != null) {
            target.setVisibility(EVisibility.VISIBLE);
        }
    }

    @Override
    public void redo() {
        if (target != null) {
            target.setVisibility(EVisibility.INVISIBLE);
        }
    }

    @Override
    public String toString() {
        return "Invisibility spell";
    }
}
