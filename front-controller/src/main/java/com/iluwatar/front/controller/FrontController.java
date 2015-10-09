package com.iluwatar.front.controller;

import com.iluwatar.front.controller.command.ICommand;
import com.iluwatar.front.controller.command.UnknownCommand;

/**
 * 
 * FrontController is the handler class that takes in all the requests and
 * renders the correct response.
 *
 */
public class FrontController {
	
	public void handleRequest(String request) {
		ICommand command = getCommand(request);
		command.process();
	}
	
	@SuppressWarnings("rawtypes")
	private ICommand getCommand(String request) {
		Class commandClass = getCommandClass(request);
		try {
			return (ICommand) commandClass.newInstance();
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}
	
	@SuppressWarnings("rawtypes")
	private Class getCommandClass(String request) {
		Class result;
		try {
			result = Class.forName("com.iluwatar." + request + "Command");
		} catch (ClassNotFoundException e) {
			result = UnknownCommand.class;
		}
		return result;
	}
}
