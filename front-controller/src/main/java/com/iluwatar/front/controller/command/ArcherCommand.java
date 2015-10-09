package com.iluwatar.front.controller.command;

import com.iluwatar.front.controller.view.ArcherView;

/**
 * 
 * Command for archers.
 *
 */
public class ArcherCommand implements ICommand {

	@Override
	public void process() {
		new ArcherView().display();
	}
}
