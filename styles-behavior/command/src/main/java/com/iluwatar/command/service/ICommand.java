package com.iluwatar.command.service;

import com.iluwatar.command.target.Target;

/**
 * 
 * Interface for Commands.
 * 
 */
public interface ICommand {

    public void execute(Target target);

    public void undo();

    public void redo();

    public String toString();

}
