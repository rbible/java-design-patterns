package com.iluwatar.front.controller.command;

import com.iluwatar.front.controller.view.CatapultView;

/**
 * 
 * Command for catapults.
 *
 */
public class CatapultCommand implements ICommand {

	@Override
	public void process() {
		new CatapultView().display();
	}
}
