package com.iluwatar.command.service;

import java.util.Deque;
import java.util.LinkedList;

import com.iluwatar.command.target.Target;

/**
 * 
 * Wizard is the invoker of the commands
 *
 */
public class Wizard {

    private Deque<ICommand> undoStack = new LinkedList<>();
    private Deque<ICommand> redoStack = new LinkedList<>();

    public Wizard() {
    }

    public void castSpell(ICommand command, Target target) {
        System.out.println(this + " casts " + command + " at " + target);
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            ICommand previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            System.out.println(this + " undoes " + previousSpell);
            previousSpell.undo();
        }
    }

    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            ICommand previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            System.out.println(this + " redoes " + previousSpell);
            previousSpell.redo();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
