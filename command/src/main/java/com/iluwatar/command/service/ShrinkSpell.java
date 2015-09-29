package com.iluwatar.command.service;

import com.iluwatar.command.target.ESize;
import com.iluwatar.command.target.Target;

/**
 * 
 * ShrinkSpell is a concrete command
 *
 */
public class ShrinkSpell implements ICommand {

    private ESize oldSize;
    private Target target;

    @Override
    public void execute(Target target) {
        oldSize = target.getSize();
        target.setSize(ESize.SMALL);
        this.target = target;
    }

    @Override
    public void undo() {
        if (oldSize != null && target != null) {
            ESize temp = target.getSize();
            target.setSize(oldSize);
            oldSize = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "Shrink spell";
    }
}
