package com.iluwatar.front.controller.command;

import com.iluwatar.front.controller.view.ErrorView;

/**
 * 
 * Default command in case the mapping is not successful.
 *
 */
public class UnknownCommand implements ICommand {

	@Override
	public void process() {
		new ErrorView().display();
	}
}
